package com.example.task_06_constructors;

import java.math.BigDecimal;

public class Task1to10 {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.brand = "Ford";
        ford.yearOfProduction = 2021;
        System.out.println(ford.brand + ford.yearOfProduction);
        Car volvo = new Car();
        System.out.println(volvo.brand + volvo.yearOfProduction);
        Car chev = new Car("Chevrolet", 1967);
        System.out.println(chev.brand + chev.yearOfProduction);
        Car vw = new Car("VW", 1967);
        System.out.println(vw.brand + vw.yearOfProduction);
        vw.showDifference();
        vw.changeBrand("Chrysler");
        System.out.println(vw.brand);
        vw.introduceYourself();
        System.out.println(Car.classDescription());
        System.out.println("Number of objects " + Car.counter);
        Car[] cars = {
                new Car("Toyota", 2001),
                new Car("Hyundai", 2020),
                new Car("BMW", 2022)
        };

        for (Car car : cars) {
            car.introduceYourself();
        }
        //PERSON


        Person Jan = new Person("Jan", 20);
        Jan.introduceYourself();
        Jan.introduceYourself("Hi!");
        Person John = new Person("John");
        John.introduceYourself();
        System.out.println(Person.numberOfPeople);

        Person[] people = {
                new Person("Igi", 20),
                new Person("Biggie", 12),
                new Person("Figofago", 2)
        };

        Person Bartek = new Person("Bartek", 22);

        for (Person person : people) {
            System.out.println("Is " + person.name + " an adult?");
            System.out.println(person.isAdult());
        }

        Jan.compareAge(Bartek);

        Product bread = new Product("Bread", new BigDecimal("12.35"));
        Product cola = new Product("Cola", new BigDecimal("9.15"));
        bread.showProduct();
        bread.reducePrice(2.50);
        bread.showProduct();
        cola.showProduct();
        cola.reducePrice(1.50, "Discount");
        cola.showProduct();

        Shop grocery = new Shop("grocery");
        grocery.showProducts();
    }

    public static class Car {
        String brand;
        int yearOfProduction;
        static int counter;

        Car(){
            this("Unknown", 2000);

        }
        Car(String brand, int yearOfProduction) {
            this.brand = brand;
            this.yearOfProduction = yearOfProduction;
            counter ++;
        }

        void showDifference(){
            String brand = "dupa";
            System.out.println(this.brand + " " + brand);
        }

        void changeBrand(String newBrand){
            this.brand = newBrand;
        }

        void introduceYourself(){
            System.out.println("I'm a "+ this.brand+ " from "+ this.yearOfProduction);
        }

        static String classDescription(){
            System.out.println();
            return "This class represents cars.";
        }
    }

    public static class Person {
        String name;
        int age;
        static int numberOfPeople;

        Person(String name, int age){
            this.name = name;
            this.age = age;
            numberOfPeople ++;
        }

        Person(String name){
            this(name,0);
        }

        void introduceYourself(){
            System.out.println("Name: " + this.name + " Age: " + this.age);
        }

        void introduceYourself(String greeting){
            System.out.println(greeting);
            this.introduceYourself();
        }

        boolean isAdult(){
            if(this.age > 18){
                return true;
            }
            return false;
        }

        void compareAge(Person person){
            if(this.age > person.age){
                int ageDiff = this.age - person.age;
                System.out.println(this.name + " is older than " + person.name + " by " + ageDiff);
            }else if(this.age < person.age){
                int ageDiff = person.age - this.age;
                System.out.println(person.name + " is older than " + this.name + " by " + ageDiff);
            }else {
                System.out.println("They are the same age");
            }

        }

    }

    public static class Product {
        String name;
        BigDecimal price;

        public Product(String name, BigDecimal price) {
            this.name = name;
            this.price = price;
        }

        void showProduct(){
            System.out.println("Name: " + this.name + " Price: " + this.price);
        }

        BigDecimal reducePrice (Double amount){
            BigDecimal amountBD = new BigDecimal(amount.toString());
            if(amountBD.compareTo(BigDecimal.ZERO) < 0){
               throw new IllegalArgumentException("Amount must be greater than 0");
            }else  {
                this.price = this.price.subtract(amountBD);
                return this.price;
            }
        }

        BigDecimal reducePrice (Double amount, String reason){
            BigDecimal amountBD = new BigDecimal(amount.toString());
            if(amountBD.compareTo(BigDecimal.ZERO) < 0){
                throw new IllegalArgumentException("Amount must be greater than 0");
            }else  {
                System.out.println(reason);
                this.price = this.price.subtract(amountBD);
                return this.price;
            }
        }


    }

    public static class Shop {
        String name;
        //Product[] products;
        Shop(String name){
            this.name = name;
        }

        Product[] products = {new Product("Redbull", new BigDecimal("12.35")), new Product("Pasta", new BigDecimal("9.15"))};
        void showProducts(){
            for(Product product : products){
                product.showProduct();
            }
        }
    }
}
