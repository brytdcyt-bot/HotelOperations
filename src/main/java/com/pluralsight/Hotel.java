package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms;
    private List<Employee> employees;

    public Hotel(String name) {
        this.name = name;
        rooms = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public void addRoom(Room room) { rooms.add(room); }
    public void addEmployee(Employee employee) { employees.add(employee); }

    public void listRooms() {
        System.out.println("\nHotel Rooms:");
        for (Room room : rooms) {
            System.out.println("Room " + room.getRoomNumber() + " (" + room.getType() + ") - Occupied: " + room.isOccupied() + ", Dirty: " + room.isDirty());
        }
    }

    public void listEmployees() {
        System.out.println("\nHotel Employees:");
        for (Employee e : employees) {
            System.out.println(e.getName() + " (" + e.getRole() + ") - Hours worked: " + e.getHoursWorked());
        }
    }
}