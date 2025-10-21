package com.pluralsight;

public class Employee {
    private String name;
    private String role;
    private double hoursWorked;
    private Double lastPunchTime = null;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
        this.hoursWorked = 0;
    }

    public String getName() { return name; }
    public String getRole() { return role; }
    public double getHoursWorked() { return hoursWorked; }

    public void punchTimeCard(double time) {
        if (lastPunchTime == null) {
            lastPunchTime = time;
            System.out.println(name + " punched in at " + time);
        } else {
            double session = time - lastPunchTime;
            if (session < 0) {
                System.out.println("Error: Invalid punch out time.");
                return;
            }
            hoursWorked += session;
            System.out.println(name + " punched out at " + time + ". Hours worked this session: " + session);
            lastPunchTime = null;
        }
    }
}