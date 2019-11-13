package com.Dryft.models;

public class Car {

    private final String model;
    private final int costPerKm;
    private final String licenseNumber;
    private final CarType type;
    private final int speed;

    public Car(String model, int costPerKm, String licenseNumber, CarType type, int speed) {
        this.model = model;
        this.costPerKm = costPerKm;
        this.licenseNumber = licenseNumber;
        this.type = type;
        this.speed = speed;
    }

    public String getModel() {
        return this.model;
    }

    public int getCostPerKm() {
        return this.costPerKm;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public CarType getType() {
        return this.type;
    }

    public int getSpeed() {
        return this.speed;
    }

    public enum CarType {
        MINI, SUV, MICRO, PRIME
    }
}
