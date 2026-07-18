package com.example.task_10_Generyki;

public class TripleTest {
    public static void main(String[] args) {
        Triple<String, Integer, Boolean> t1 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> t2 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> t3 = Triple.of("id", 43, true);

        System.out.println("t1.equals(t2): " + t1.equals(t2));

        System.out.println("t1.equals(t3): " + t1.equals(t3));


        System.out.println("-----------------accessors");
        Triple<String, Integer, Boolean> t = Triple.of("id", 42, true);

        System.out.println("t.first(): " + t.first());
        System.out.println("t.second(): " + t.second());
        System.out.println("t.third(): " + t.third());


        System.out.println("------------------toString");
        Triple<String, String, String> tStr = Triple.of("A", "B", "C");

        System.out.println("tStr.toString(): " + tStr.toString());
    }
}
