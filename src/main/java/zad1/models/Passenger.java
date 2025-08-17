package zad1.models;

public class Passenger extends LoadElement{

    private String firstName;
    private String pesel;

    public Passenger(String firstName, String pesel, double weightInKg) {
        super(weightInKg);
        this.firstName = firstName;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", pesel='" + pesel + '\'' +
                super.toString() +
                '}';
    }

    @Override
    public void checkIfCanBeLoaded(Plane plane) {
        if (plane.getNumberOfSeats() <= plane.getPassengerCnt()) {
            throw new IllegalStateException("Brak wolnych miejsc!");
        }
        if (plane.getLoadElementsWeight() + getWeightInKg() > plane.getCapacityInKg()){
            throw new RuntimeException("Przekroczona ładowność samolotu!");
        }
    }
}
