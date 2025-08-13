package zad1.models;

public class Luggage extends LoadElement{

    private String company;
    //private double weightInKg;

    public Luggage(String company, double weightInKg) {
        super(weightInKg);
        this.company = company;
    }


//    public Luggage(String company, double weight) {
//        this.company = company;
//        this.weightInKg = weight;
//    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

//    public double getWeightInKg() {
//        return weightInKg;
//    }
//
//    public void setWeightInKg(double weightInKg) {
//        this.weightInKg = weightInKg;
//    }

//    @Override
//    public String toString() {
//        return "Luggage{" +
//                "company='" + company + '\'' +
//                ", weightInKg=" + weightInKg +
//                '}';
//    }


//    @Override
//    public String toString() {
//        return "Luggage{" +
//                "company='" + company + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Luggage{" +
                "company='" + company
                + super.toString()
                + '\'' +
                '}';
    }
}
