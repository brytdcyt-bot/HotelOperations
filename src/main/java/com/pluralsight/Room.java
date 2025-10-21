package com.pluralsight;

public class Room {
    private int roomNumber;
    private boolean occupied;
    private boolean dirty;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.occupied = false;
        this.dirty = false;
    }

    public void checkIn() {
        if (!occupied && !dirty) {
            occupied = true;
            dirty = true; // After check-in, room becomes dirty
            System.out.println("Room " + roomNumber + " is now occupied and dirty.");
        } else if (occupied) {
            System.out.println("Room " + roomNumber + " is already occupied!");
        } else if (dirty) {
            System.out.println("Room " + roomNumber + " must be cleaned first!");
        }
    }

    public void checkOut() {
        if (occupied) {
            occupied = false;
            System.out.println("Guest has checked out of room " + roomNumber + ". Room is now dirty.");
        } else {
            System.out.println("Room " + roomNumber + " is not currently occupied.");
        }
    }

    public void cleanRoom() {
        if (dirty) {
            dirty = false;
            System.out.println("Room " + roomNumber + " has been cleaned.");
        } else {
            System.out.println("Room " + roomNumber + " is already clean.");
        }
    }

    // Optional getters for status
    public boolean isOccupied() { return occupied; }
    public boolean isDirty() { return dirty; }
}
