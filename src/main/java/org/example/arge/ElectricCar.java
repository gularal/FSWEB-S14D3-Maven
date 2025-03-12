package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " electric motor with " + batterySize + " kWh battery is starting...");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println(getName() + " is driving with battery efficiency of " + avgKmPerCharge + " km/charge.");
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }
    public int getBatterySize() {
        return batterySize;
    }
}
