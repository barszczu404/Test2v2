package zad1.models;

public abstract class LoadElement {

    private double weightInKg;

    protected LoadElement(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    @Override
    public String toString() {
        return ", weightInKg=" + weightInKg +
                '}';
    }

    public abstract void checkIfCanBeLoaded(Plane plane) throws RuntimeException;
}
