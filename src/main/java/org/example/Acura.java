package org.example;

public class Acura implements Automobile {
    private int year;
    private String model;
    public Acura(int year, String model) {
        this.year = year;
        this.model = model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getMake() {
        return "Acura";
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void startEngine() {
        System.out.println("The engine is on.");
    }
}
