package zad1.models;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private String name;
    private String producer;
    private int numberOfSeats;
    private double capacityInKg;

    private double loadElementsWeight;
    private int passengerCnt = 0;
    private List<LoadElement> loadElements = new ArrayList<>();

    public Plane(String name, String producer, int numberOfSeats, double capacityInKg) {
        this.name = name;
        this.producer = producer;
        this.numberOfSeats = numberOfSeats;
        this.capacityInKg = capacityInKg;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getCapacityInKg() {
        return capacityInKg;
    }

    public double getLoadElementsWeight() {
        return loadElementsWeight;
    }

    public int getPassengerCnt() {
        return passengerCnt;
    }

    public List<LoadElement> getLoadElements() {
        return loadElements;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", capacityInKg=" + capacityInKg +
                ", loadElements=" + loadElements +
                '}';
    }

    public void addToPlane(LoadElement loadElement) {
        try {
            loadElement.checkIfCanBeLoaded(this);
            loadElements.add(loadElement);
            loadElementsWeight += loadElement.getWeightInKg();
            if (loadElement instanceof Passenger) {
                passengerCnt++;
            }
            System.out.println("Dodano na pokład: " + loadElement);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
