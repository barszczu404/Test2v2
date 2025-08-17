package zad3.models;

import java.util.*;

public class Backpack {

    private String brand;
    private double value;
    private Map<String, Product> backpackContents = new LinkedHashMap<>();

    public Backpack(String brand) {
        this.brand = brand;
        this.value = 0;
    }

    public String getBrand() {
        return brand;
    }

    public double getValue() {
        return value;
    }

    public Map<String, Product> getBackpackContents() {
        return Collections.unmodifiableMap(backpackContents);
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

//    public boolean containsType(String type){
//        String normalizedType = type.toLowerCase().trim();
//       for (String key : backpackContents.keySet()){
//           if (key.equalsIgnoreCase(normalizedType)){
//               return true;
//           }
//       }
//       return false;
//    }

    public void addProductToBackpack(Product product){
        String key = product.getType().toLowerCase().trim();
        if (backpackContents.containsKey(key)){
            throw new RuntimeException("Produkt tego typu już jest w plecaku");
        } else {
            backpackContents.put(key, product);
            value += product.getPrice();
        }
    }

}
