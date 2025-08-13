package zad1.models;

public abstract class LoadElement {

    private double weightInKg;

    public LoadElement(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    @Override
    public String toString() {
        return ", weightInKg=" + weightInKg +
                '}';
    }
}
