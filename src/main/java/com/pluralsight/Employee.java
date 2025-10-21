package com.pluralsight;

public class Employee {
    private String name;
    private double hoursWorked;
    private Double lastPunchTime = null; // null means currently punched out

    public Employee(String name) {
        this.name = name;
        this.hoursWorked = 0;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Single method to handle punch in/out.
     * If currently punched out, records punch in time.
     * If currently punched in, calculates session hours and adds to total hours.
     */
    public void punchTimeCard(double time) {
        if (lastPunchTime == null) {
            // Punching in
            lastPunchTime = time;
            System.out.println(name + " punched in at " + time);
        } else {
            // Punching out
            double sessionHours = time - lastPunchTime;
            if (sessionHours < 0) {
                System.out.println("Error: Punch out time cannot be earlier than punch in time.");
                return;
            }
            hoursWorked += sessionHours;
            System.out.println(name + " punched out at " + time + ". Hours worked this session: " + sessionHours);
            lastPunchTime = null; // Reset for next punch
        }
    }
}