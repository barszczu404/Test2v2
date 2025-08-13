package zad3.app;

import zad3.models.Backpack;
import zad3.models.Product;

public class Runner {

    public static void main(String[] args) {

        Backpack backpack = new Backpack("Reebok");
        Product fryingPan = new Product("Frying Pan", "Tefal", 80);
        Product huxley = new Product("Watch", "Huxley", 650);
        Product garmin = new Product("watch", "Garmin", 1000);
        Product piatnica = new Product("sour cream", "Piątnica 18%", 5);
        Product krasnystaw = new Product("Sour Cream", "Krasnystaw 12%", 3.60);
        Product chocolate = new Product("chocolate", "Milka", 8.70);

        backpack.addProductToBackpack(fryingPan);
        backpack.addProductToBackpack(huxley);
        backpack.addProductToBackpack(garmin);
        backpack.addProductToBackpack(piatnica);
        backpack.addProductToBackpack(krasnystaw);
        backpack.addProductToBackpack(chocolate);

        System.out.println("backpack = " + backpack);

    }

}
