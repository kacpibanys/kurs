package com.example.task_07_enum;

public class Task18 {
    public enum Category{
        FOOD,
        ELECTRONICS,
        CLOTHING;
    }
    public static class Product{
        String name;
        Category category;

        public Product(String name,  Category category) {
            this.name = name;
            this.category = category;
        }

        public Category getCategory() {
            return category;
        }
        public String getName() {
            return name;
        }


    }

    static void main(String[] args) {
        Product[] products = {
                new Product("Bread", Category.FOOD),
                new Product("Smartphone", Category.ELECTRONICS),
                new Product("Jacket", Category.CLOTHING),
                new Product("Apple", Category.FOOD),
                new Product("TV", Category.ELECTRONICS)
        };
        for (Product p : products) {
            System.out.println(p.getCategory() + " " + p.getName());
        }

        Category category1 = Category.FOOD;
        Category category2 = Category.FOOD;
        System.out.println(category1 == category2);
        System.out.println(category1.equals(category2));
    }
}
