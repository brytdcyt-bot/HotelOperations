package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Reservations {
    private List<Room> rooms;

    public Reservations(int numSuites, int numBasicRooms) {
        rooms = new ArrayList<>();

        int roomNumber = 1;
        for (int i = 0; i < numSuites; i++) {
            rooms.add(new Room(roomNumber++, "Suite"));
        }
        for (int i = 0; i < numBasicRooms; i++) {
            rooms.add(new Room(roomNumber++, "Basic"));
        }
    }

    // Book rooms
    public boolean bookRooms(int count, String type) {
        int bookedCount = 0;
        for (Room room : rooms) {
            if (room.getType().equalsIgnoreCase(type) && room.isAvailable()) {
                room.book();
                bookedCount++;
                if (bookedCount == count) return true;
            }
        }
        return false; // not enough rooms available
    }

    // Get available rooms of a type
    public int getAvailable(String type) {
        int count = 0;
        for (Room room : rooms) {
            if (room.getType().equalsIgnoreCase(type) && room.isAvailable()) {
                count++;
            }
        }
        return count;
    }

    // Print all rooms
    public void printRooms() {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }
}