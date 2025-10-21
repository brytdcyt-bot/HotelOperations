package com.pluralsight;

public class Reservations {
    private Room room;
    private int numberOfNights;
    private boolean weekend;

    public Reservations(Room room, int numberOfNights, boolean weekend) {
        this.room = room;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public Room getRoom() { return room; }
    public int getNumberOfNights() { return numberOfNights; }
    public boolean isWeekend() { return weekend; }

    public double getPricePerNight() {
        switch (room.getType()) {
            case "king": return weekend ? 139.0 * 1.1 : 139.0;
            case "double": return weekend ? 124.0 * 1.1 : 124.0;
            default: return 0.0;
        }
    }

    public double getReservationTotal() {
        return getPricePerNight() * numberOfNights;
    }
}