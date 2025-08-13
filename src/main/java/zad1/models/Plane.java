package zad1.models;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private String name;
    private String producer;
    private int numberOfSeats;
    private double capacityInKg;
//
//    private double passengersWeight = 0;
////    private double luggageWeight = 0;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getCapacityInKg() {
        return capacityInKg;
    }

    public void setCapacityInKg(double capacityInKg) {
        this.capacityInKg = capacityInKg;
    }

//    public double getPassengersWeight() {
//        return passengersWeight;
//    }
//
//    public void setPassengersWeight(double passengersWeight) {
//        this.passengersWeight = passengersWeight;
//    }
//
//    public double getLuggageWeight() {
//        return luggageWeight;
//    }
//
//    public void setLuggageWeight(double luggageWeight) {
//        this.luggageWeight = luggageWeight;
//    }


    public double getLoadElementsWeight() {
        return loadElementsWeight;
    }

    public void setLoadElementsWeight(double loadElementsWeight) {
        this.loadElementsWeight = loadElementsWeight;
    }

    public int getPassengerCnt() {
        return passengerCnt;
    }

    public void setPassengerCnt(int passengerCnt) {
        this.passengerCnt = passengerCnt;
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
}
