package zad1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return numberOfSeats == plane.numberOfSeats && Double.compare(capacityInKg, plane.capacityInKg) == 0 && Double.compare(loadElementsWeight, plane.loadElementsWeight) == 0 && passengerCnt == plane.passengerCnt && Objects.equals(name, plane.name) && Objects.equals(producer, plane.producer) && Objects.equals(loadElements, plane.loadElements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, producer, numberOfSeats, capacityInKg, loadElementsWeight, passengerCnt, loadElements);
    }

//    public void addToPlane(LoadElement loadElement) {
//        try {
//            loadElement.checkIfCanBeLoaded(this);
//            loadElements.add(loadElement);
//            loadElementsWeight += loadElement.getWeightInKg();
//            if (loadElement instanceof Passenger) {
//                passengerCnt++;
//            }
//            System.out.println("Dodano na pokład: " + loadElement);
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
//    }

    public void addToPlane(LoadElement loadElement) {
        loadElement.checkIfCanBeLoaded(this);
        loadElements.add(loadElement);
        loadElementsWeight += loadElement.getWeightInKg();
        if (loadElement instanceof Passenger) {
            passengerCnt++;
        }
    }
}
