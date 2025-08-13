package zad3.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Backpack {

    private String brand;
    private double value;
    private Map<String, Product> backpackContents = new HashMap<>();

    public Backpack(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getValue() {
        double total = 0;
        for (Product product : backpackContents.values()){
            total += product.getPrice();
        }
        return total;
    }

    public Map<String, Product> getBackpackContents() {
        return backpackContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Backpack backpack = (Backpack) o;
        return Double.compare(value, backpack.value) == 0 && Objects.equals(brand, backpack.brand) && Objects.equals(backpackContents, backpack.backpackContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, value, backpackContents);
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "brand='" + brand + '\'' +
                ", value=" + getValue() +
                ", backpackContents=" + backpackContents +
                '}';
    }

    public void addProductToBackpack(Product product){
        try {
            for (String key : backpackContents.keySet()) {
                if (key.equalsIgnoreCase(product.getType())) {
                    throw new RuntimeException("Produkt tego typu już jest w plecaku");
                }
            }
            backpackContents.put(product.getType(), product);
            System.out.println("Dodano do plecaka " + product);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
