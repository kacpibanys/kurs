package com.example.task_10_Generyki;

public class PairTest {
    static void main(String[] args) {
        System.out.println("TASK 1");
        Pair<Integer, String> p1 = Pair.of(1, "a");
        Pair<Integer, String> p2 = Pair.of(1, "a");
        Pair<Integer, String> p3 = Pair.of(1, "b");


        System.out.println("--------------------equals i hashcode");
        System.out.println("p1.equals(p2) : " + p1.equals(p2));

        System.out.println("p1.equals(p3) : " + p1.equals(p3));

        System.out.println("hashCode p1 == p2 : " + (p1.hashCode() == p2.hashCode()));

        System.out.println("--------------------nulle");

        Pair<Object, String> p = Pair.of(null, "x");

        System.out.println("p.first() : " + p.first());

        System.out.println("p.toString() : " + p.toString());

        System.out.println("--------------------niemutowalnosc");
        Pair<String, String> p4 = Pair.of("A", "B");
        System.out.println("p4: " + p4);

        // p4.first = "C";
        // p4.setFirst("C");
    }
}
