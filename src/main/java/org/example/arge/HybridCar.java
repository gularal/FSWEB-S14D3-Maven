package org.example.arge;

public class HybridCar extends GasPoweredCar {
    private int batterySize;

    public HybridCar(String name, String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(name, description, avgKmPerLitre, cylinders);
        this.batterySize = batterySize;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }


    @Override
    public void drive() {System.out.println("Hybrid engine.");
    }

    @Override
    public void startEngine() {System.out.println("Hybrid car is being driven.");
    }


}