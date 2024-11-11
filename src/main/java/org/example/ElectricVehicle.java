package org.example;

public interface ElectricVehicle {
    int getCharge();
    int charge(int minutesCharging);
    int drive(int minutesDriven);
}
