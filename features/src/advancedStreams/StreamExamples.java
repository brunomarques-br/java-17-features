package advancedStreams;

import advancedStreams.model.Order;
import advancedStreams.model.Person;
import advancedStreams.model.Product;

import java.util.ArrayList;
import java.util.List;

public class StreamExamples {

    public static void main(String[] args) {

        // Sample data Person
        Person ana = new Person("Ana", 20, "Texas");
        Person bob = new Person("Bob", 30, "Austin");
        Person steve = new Person("Steve", 20, "Huston");
        Person mary = new Person("Mary", 40, "Hollywood");

        // Sample data Product
        Product tv = new Product("SKU-TV-01", "TV 72", 450.0);
        Product mouse = new Product("SKU-MOUSE-01", "Mouse", 15.0);
        Product keyboard = new Product("SKU-KEYBOARD-01", "Keyboard", 25.0);
        Product phone = new Product("SKU-PHONE-01", "Phone", 600.0);

        // duplicating SKU to demonstrate "toMap merge"
        Product phoneAlt = new Product("SKU-PHONE-01", "Phone - Promo", 499.0);

        List<Order> orders = List.of(
                new Order(1, ana, List.of(tv,mouse)),
                new Order(2, bob, List.of(keyboard)),
                new Order(3, steve, List.of(mouse, keyboard, phone)),
                new Order(4, mary, List.of(phoneAlt))

        );

    }

}
