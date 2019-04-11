package com.ujjwal.scrollviewappdesign;

public class Car {
    private String make;
    private int year;
    private String color;
    private double price;
    private double engine;

    public Car(String make, int year, String color, double price, double engine) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.price = price;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
}
