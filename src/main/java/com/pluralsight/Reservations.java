package com.pluralsight;

public class Reservations {
    private String roomType; // "king" or "double"
    private int numberOfNights;
    private boolean isWeekend;
    private double pricePerNight;

    public Reservations(String roomType, int numberOfNights, boolean isWeekend) {
        setRoomType(roomType); // sets price based on type
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType.toLowerCase();
        if (roomType.equalsIgnoreCase("king")) {
            pricePerNight = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            pricePerNight = 124.00;
        } else {
            throw new IllegalArgumentException("Invalid room type. Must be 'king' or 'double'.");
        }
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getPrice() {
        double finalPrice = pricePerNight;
        if (isWeekend) {
            finalPrice *= 1.10; // 10% increase
        }
        return finalPrice;
    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }
}