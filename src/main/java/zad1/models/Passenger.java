package zad1.models;

public class Passenger extends LoadElement{

    private String firstName;
    private String pesel;
    //private double weightInKg;

    public Passenger(String firstName, String pesel, double weightInKg) {
        super(weightInKg);
        this.firstName = firstName;
        this.pesel = pesel;
    }


//    public Passenger(String firstName, String pesel, double weight) {
//        this.firstName = firstName;
//        this.pesel = pesel;
//        this.weightInKg = weight;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

//    public double getWeightInKg() {
//        return weightInKg;
//    }
//
//    public void setWeightInKg(double weightInKg) {
//        this.weightInKg = weightInKg;
//    }
//
//    @Override
//    public String toString() {
//        return "Passenger{" +
//                "firstName='" + firstName + '\'' +
//                ", pesel='" + pesel + '\'' +
//                ", weightInKg=" + weightInKg +
//                '}';
//    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", pesel='" + pesel + '\'' +
                super.toString() +
                '}';
    }
}
