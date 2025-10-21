package com.pluralsight;

public class Room {
    private String type; // "Suite" or "Basic"
    private int roomNumber;
    private boolean isBooked;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isBooked = false;
    }

    // Book this room
    public boolean book() {
        if (!isBooked) {
            isBooked = true;
            return true;
        }
        return false;
    }

    // Check availability
    public boolean isAvailable() {
        return !isBooked;
    }

    // Getters
    public String getType() { return type; }
    public int getRoomNumber() { return roomNumber; }
    public boolean getIsBooked() { return isBooked; }

    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + type + ") - " + (isBooked ? "Booked" : "Available");
    }
}