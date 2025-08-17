package zad1.models;

public class Luggage extends LoadElement{

    private String company;

    public Luggage(String company, double weightInKg) {
        super(weightInKg);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Luggage{" +
                "company='" + company
                + super.toString()
                + '\'' +
                '}';
    }

    @Override
    public void checkIfCanBeLoaded(Plane plane) {
        if (plane.getLoadElementsWeight() + getWeightInKg() > plane.getCapacityInKg()) {
            throw new RuntimeException("Przekroczona ładowność samolotu!");
        }
    }
}
