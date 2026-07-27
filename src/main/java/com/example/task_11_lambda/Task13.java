package com.example.task_11_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Task13 {
    public static class Product {
        private String name;
        private double price;
        private int rating;
        public Product(String name, double price, int rating) {
            this.name = name;
            this.price = price;
            if (rating > 5 || rating < 1) {
                throw new IllegalArgumentException("rating should be between 1 and 5");
            }else{
                this.rating = rating;
            }
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getRating() {
            return rating;
        }

        @Override
        public String toString() {
            return "Produkt: " + name + " | Cena: " + price + " zł | Ocena: " + rating + "/5";
        }
    }

    static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(
                new Product("produkt1", 450.0, 5),
                new Product("produkt2", 150.0, 3),
                new Product("produkt3", 150.0, 5),
                new Product("produkt4", 1200.0, 4)
        ));

        Comparator<Product> productComparator = Comparator
                .comparing(Product::getPrice)
                .thenComparing(Comparator.comparing(Product::getRating).reversed());

        products.sort(productComparator);
        products.forEach(System.out::println);
    }
}
