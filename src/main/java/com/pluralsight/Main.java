package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Test Room
        Room room1 = new Room(2, 150.0, false, false);
        System.out.println("Room available? " + room1.isAvailable());

        // Test Reservation
        Reservations res1 = new Reservations("King", 3, true);
        System.out.println("Room type: " + res1.getRoomType());
        System.out.println("Price per night: $" + res1.getPrice());
        System.out.println("Reservation total: $" + res1.getReservationTotal());

        // Test Employee
        Employee emp1 = new Employee(101, "John Doe", "Housekeeping", 20.0, 45);
        System.out.println(emp1.getName() + " worked " + emp1.getHoursWorked() + " hours.");
        System.out.println("Regular Hours: " + emp1.getRegularHours());
        System.out.println("Overtime Hours: " + emp1.getOvertimeHours());
        System.out.println("Total Pay: $" + emp1.getTotalPay());
    }
}