package zad1.services;

import zad1.models.LoadElement;
import zad1.models.Luggage;
import zad1.models.Passenger;
import zad1.models.Plane;

public class PlaneService {

    //- do samolotu mozna dodawac bagaze i pasazerow ale: pasazerow nie moze byc wiecej niz miejsc siedzących
    //- suma wag pasazerow i bagaży nie może być większa niż ładownośc samolotu
//
//    private void addPassengerToThePlane(Passenger passenger, Plane plane) {
//        try {
//            if (plane.getNumberOfSeats() >= (plane.getPassengerCnt() + 1)) {
//                if (plane.getCapacityInKg() >= (passenger.getWeightInKg() + plane.getPassengersWeight() + plane.getLuggageWeight())) {
//                    plane.setPassengersWeight(plane.getPassengersWeight() + passenger.getWeightInKg());
//                    plane.setPassengerCnt(plane.getPassengerCnt() + 1);
//                    plane.getLoadElements().add(passenger);
//                    System.out.println("Dodano pasażera " + passenger);
//                } else {
//                    throw new RuntimeException("Przekroczona ładowność samolotu!");
//                }
//            } else {
//                throw new IllegalStateException("Brak wolnych mijesc!");
//            }
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage() != null ? e.getMessage() : "Nieznany błąd");
//        }
//    }
//
//    private void addLuggageToThePlane(Luggage luggage, Plane plane) {
//        try {
//            if (plane.getCapacityInKg() >= (plane.getPassengersWeight() + plane.getLuggageWeight() + luggage.getWeightInKg())) {
//                plane.setLuggageWeight(plane.getLuggageWeight() + luggage.getWeightInKg());
//                plane.getLoadElements().add(luggage);
//                System.out.println("Dodano bagaż " + luggage);
//            } else {
//                throw new RuntimeException("Przekroczona ładowność samolotu!");
//            }
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
//    }

    public void addToPlane(LoadElement loadElement, Plane plane) {
        try {
            if (loadElement instanceof Passenger) {
                Passenger passenger = (Passenger) loadElement;
                if (plane.getNumberOfSeats() >= (plane.getPassengerCnt()) + 1) {
                    if (plane.getCapacityInKg() <= (plane.getLoadElementsWeight() + loadElement.getWeightInKg())) {
                        throw new RuntimeException("Przekroczona ładowność samolotu!");
                    }
                    plane.getLoadElements().add(passenger);
                    plane.setPassengerCnt(plane.getPassengerCnt() + 1);
                    plane.setLoadElementsWeight(plane.getLoadElementsWeight() + passenger.getWeightInKg());
                    System.out.println("Dodano na pokład " + passenger);
                } else {
                    throw new IllegalStateException("Brak wolnych mijesc!");
                }
            }
            if (loadElement instanceof Luggage) {
                if (plane.getCapacityInKg() <= (plane.getLoadElementsWeight() + loadElement.getWeightInKg())) {
                    throw new RuntimeException("Przekroczona ładowność samolotu!");
                }
                Luggage luggage = (Luggage) loadElement;
                plane.getLoadElements().add(luggage);
                plane.setLoadElementsWeight(plane.getLoadElementsWeight() + loadElement.getWeightInKg());
                System.out.println("Dodano na pokład " + luggage);
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage() != null ? e.getMessage() : "Nieznany błąd");
        }
    }
}
