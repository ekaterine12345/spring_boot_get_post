package com.example.ttt_spr.models;

public class Car {
    private int ID;
    private String manufacturer;
    private int year;

    public Car(int ID, String manufacturer, int year) {
        this.ID = ID;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public Car() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
