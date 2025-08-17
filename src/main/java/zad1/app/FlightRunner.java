package zad1.app;

import zad1.models.LoadElement;
import zad1.models.Luggage;
import zad1.models.Passenger;
import zad1.models.Plane;

public class FlightRunner {

    public static void main(String[] args) {

        Plane boeing = new Plane("Boeing 747", "Boeing", 366, 40000);
        Plane airbus = new Plane("A380", "Airbus", 555, 50000);
        Plane lightAircraft = new Plane("Cessna 172", "Cessna", 4, 400);


        Passenger johny = new Passenger("Jan", "97031309177", 90);
        Passenger ala = new Passenger("Alicja", "61060806266", 65);
        Passenger stewardess = new Passenger("Karolina", "80041508344", 55);
        Passenger marek = new Passenger("Marek", "76120407833", 120);
        Passenger jola = new Passenger("Jolanta", "92020209488", 78);

        Luggage luggage1 = new Luggage("Wings", 20);
        Luggage luggage2 = new Luggage("Samsonite", 60);
        Luggage luggage3 = new Luggage("Rimowa", 35);
        Luggage luggage4 = new Luggage("Wittchen", 20);

       tryToLoad(lightAircraft, johny);
       tryToLoad(lightAircraft, ala);
       tryToLoad(lightAircraft, marek);
       tryToLoad(lightAircraft, jola);
       tryToLoad(lightAircraft, stewardess);

       tryToLoad(lightAircraft, luggage1);
       tryToLoad(lightAircraft, luggage2);
       tryToLoad(lightAircraft, luggage3);

       tryToLoad(boeing, luggage4);
       tryToLoad(boeing, stewardess);

//        lightAircraft.addToPlane(johny);
//        lightAircraft.addToPlane(ala);
//        lightAircraft.addToPlane(marek);
//        lightAircraft.addToPlane(jola);
//        lightAircraft.addToPlane(stewardess);
//        lightAircraft.addToPlane(luggage1);
//        lightAircraft.addToPlane(luggage2);
//        lightAircraft.addToPlane(luggage3);
//
//        boeing.addToPlane(luggage4);
//        boeing.addToPlane(stewardess);

    }

    private static void tryToLoad(Plane plane, LoadElement loadElement) { //zeby nie pisac try catch do kazdej linijki
        try {
            plane.addToPlane(loadElement);
            System.out.println("Dodano na pokład: " + loadElement);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
