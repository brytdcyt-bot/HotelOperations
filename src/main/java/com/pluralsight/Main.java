package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // ------------------------
        // Test Room
        // ------------------------
        Room room1 = new Room(101);
        System.out.println("Room 101 occupied? " + room1.isOccupied());
        System.out.println("Room 101 dirty? " + room1.isDirty());

        room1.checkIn(); // Guest checks in
        System.out.println("After check-in: occupied? " + room1.isOccupied() + ", dirty? " + room1.isDirty());

        room1.checkOut(); // Guest checks out
        System.out.println("After check-out: occupied? " + room1.isOccupied() + ", dirty? " + room1.isDirty());

        room1.cleanRoom(); // Housekeeper cleans
        System.out.println("After cleaning: occupied? " + room1.isOccupied() + ", dirty? " + room1.isDirty());

        // ------------------------
        // Test Reservations
        // ------------------------
        Reservations res1 = new Reservations("King", 3, true); // Weekend stay
        System.out.println("\nReservation Details:");
        System.out.println("Room type: " + res1.getRoomType());
        System.out.println("Price per night: $" + res1.getPrice());
        System.out.println("Total cost for " + res1.getNumberOfNights() + " nights: $" + res1.getReservationTotal());

        // ------------------------
        // Test Employee (bonus punchTimeCard version)
        // ------------------------
        Employee emp1 = new Employee("John Doe");

        emp1.punchTimeCard(9.0);   // Punch in at 9:00 AM
        emp1.punchTimeCard(17.5);  // Punch out at 5:30 PM

        emp1.punchTimeCard(18.0);  // Punch in at 6:00 PM
        emp1.punchTimeCard(20.0);  // Punch out at 8:00 PM

        System.out.println("\nEmployee Work Summary:");
        System.out.println(emp1.getName() + " total hours worked: " + emp1.getHoursWorked());
    }
}