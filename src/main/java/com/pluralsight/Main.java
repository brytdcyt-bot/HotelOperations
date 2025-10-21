package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reservations hotel = new Reservations(3, 5); // 3 suites, 5 basic rooms
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hotel Reservation System!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View all rooms");
            System.out.println("2. Book a room");
            System.out.println("3. Check available rooms");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    hotel.printRooms();
                    break;
                case 2:
                    System.out.print("Enter room type (Suite/Basic): ");
                    String type = scanner.nextLine();
                    System.out.print("How many rooms to book? ");
                    int count = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    boolean success = hotel.bookRooms(count, type);
                    if (success) {
                        System.out.println(count + " " + type + " room(s) successfully booked!");
                    } else {
                        System.out.println("Not enough available " + type + " rooms.");
                    }
                    break;
                case 3:
                    System.out.print("Enter room type (Suite/Basic): ");
                    String checkType = scanner.nextLine();
                    int available = hotel.getAvailable(checkType);
                    System.out.println("Available " + checkType + " rooms: " + available);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}