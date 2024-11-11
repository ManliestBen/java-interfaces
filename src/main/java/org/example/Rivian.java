package org.example;

public class Rivian implements Automobile, ElectricVehicle {
    private int year;
    private String model;
    private int charge = 100;
    public Rivian(int year, String model) {
        this.year = year;
        this.model = model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getMake() {
        return "Rivian";
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void startEngine() {
        System.out.println("The engine is on, but you can't hear it!");
    }

    @Override
    public int getCharge() {
        return charge;
    }

    @Override
    public int charge(int minutesCharged) {
        for (int i = 0; i < minutesCharged; i++) {
            if (charge < 100) {
                charge++;
            }
        }
        return charge;
    }

    @Override
    public int drive(int minutesDriven) {
        charge = charge - minutesDriven;
        return charge;
    }

}
