package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " gas engine with " + cylinders + " cylinders is starting...");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println(getName() + " is driving with fuel efficiency of " + avgKmPerLitre + " km/l.");
    }
    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    public double getAverageKmPerLiters() {
        return avgKmPerLitre;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }
    public int getCylinders() {
        return cylinders;
    }
}