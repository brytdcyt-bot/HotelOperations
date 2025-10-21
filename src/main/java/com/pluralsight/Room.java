package com.pluralsight;

public class Room {
    private int roomNumber;
    private String type; // king, double
    private boolean occupied;
    private boolean dirty;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type.toLowerCase();
        this.occupied = false;
        this.dirty = false;
    }

    public int getRoomNumber() { return roomNumber; }
    public String getType() { return type; }
    public boolean isOccupied() { return occupied; }
    public boolean isDirty() { return dirty; }

    public void checkIn() {
        if (!occupied && !dirty) {
            occupied = true;
            dirty = true;
            System.out.println("Room " + roomNumber + " is now occupied and dirty.");
        } else if (occupied) {
            System.out.println("Room " + roomNumber + " is already occupied.");
        } else {
            System.out.println("Room " + roomNumber + " must be cleaned first.");
        }
    }

    public void checkOut() {
        if (occupied) {
            occupied = false;
            System.out.println("Guest has checked out of room " + roomNumber + ". Room is now dirty.");
        } else {
            System.out.println("Room " + roomNumber + " is not occupied.");
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
}