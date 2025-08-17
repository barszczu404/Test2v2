package zad3.app;

import java.util.List;
import zad3.models.Backpack;
import zad3.models.Product;

public class Runner {

    public static void main(String[] args) {

        Backpack backpack = new Backpack("Reebok");

        List<Product> products = List.of(
                new Product("Frying Pan", "Tefal", 80),
                new Product("Watch", "Huxley", 650),
                new Product("watch", "Garmin", 1000),
                new Product("sour cream", "Piątnica 18%", 5),
                new Product("Sour Cream", "Krasnystaw 12%", 3.60),
                new Product("chocolate", "Milka", 8.70)
                );

        for (Product product : products) {
            try {
                backpack.addProductToBackpack(product);
                System.out.println("Dodano do plecaka " + product);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("backpack = " + backpack);

    }

}
