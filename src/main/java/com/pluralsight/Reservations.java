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
        if (roomType == null) {
            throw new IllegalArgumentException("Room type cannot be null.");
        }

        String type = roomType.toLowerCase();

        switch (type) {
            case "king":
                this.roomType = "king";
                pricePerNight = 139.00;
                break;
            case "double":
                this.roomType = "double";
                pricePerNight = 124.00;
                break;
            default:
                throw new IllegalArgumentException("Invalid room type. Must be 'king' or 'double'.");
        }
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        if (numberOfNights <= 0) {
            throw new IllegalArgumentException("Number of nights must be positive.");
        }
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    /**
     * Returns the price per night, including weekend adjustment.
     */
    public double getPrice() {
        double finalPrice = pricePerNight;
        if (isWeekend) {
            finalPrice *= 1.10; // 10% increase for weekend
        }
        return finalPrice;
    }

    /**
     * Returns the total reservation cost for all nights.
     */
    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }
}