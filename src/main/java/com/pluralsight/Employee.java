package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private String name;
    private double lastPunchIn;
    private double lastPunchOut;

    public Employee(String name) {
        this.name = name;
    }

    // Overloaded punchIn with time input
    public void punchIn(double time) {
        lastPunchIn = time;
        System.out.println(name + " punched in at: " + time);
    }

    // Overloaded punchIn with no input - uses current time
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + now.getMinute() / 60.0;
        punchIn(time);
    }

    // Overloaded punchOut with time input
    public void punchOut(double time) {
        lastPunchOut = time;
        System.out.println(name + " punched out at: " + time);
    }

    // Overloaded punchOut with no input - uses current time
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + now.getMinute() / 60.0;
        punchOut(time);
    }

    // Optional getters
    public double getLastPunchIn() { return lastPunchIn; }
    public double getLastPunchOut() { return lastPunchOut; }
}