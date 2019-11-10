package com.Dryft.models;

public class Driver {
    private final String name;
    private final Car car;
    private final char sex;
    private Location location;
    private double rating;
    private int reviews;

    public Driver(String name, Car car, Location location, char sex, double rating, int reviews) {
        this.name = name;
        this.car = car;
        this.location = location;
        this.sex = sex;
        this.rating = rating;
        this.reviews = reviews;
    }

    public Location getLocation() { return location; }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public char getSex() { return sex; }

    public double getRating() { return rating; }

    public void updateRating(int review) {
        double total_rating = ((this.rating * this.reviews) + review);
        this.reviews++;
        this.rating = total_rating / this.reviews;
    }
}
