package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Create hotel
        Hotel hotel = new Hotel("Pluralsight Inn");

        // Add rooms
        Room r1 = new Room(101, "king");
        Room r2 = new Room(102, "double");
        hotel.addRoom(r1);
        hotel.addRoom(r2);

        // Add employees
        Employee e1 = new Employee("John Doe", "Housekeeping");
        Employee e2 = new Employee("Jane Smith", "Front Desk");
        hotel.addEmployee(e1);
        hotel.addEmployee(e2);

        // Room test
        r1.checkIn();
        r1.checkOut();
        r1.cleanRoom();

        // Reservation test
        Reservations res1 = new Reservations(r1, 3, true);
        System.out.println("\nReservation Total: $" + res1.getReservationTotal());

        // Employee test
        e1.punchTimeCard(9.0);
        e1.punchTimeCard(17.0);

        // List hotel status
        hotel.listRooms();
        hotel.listEmployees();
    }
}