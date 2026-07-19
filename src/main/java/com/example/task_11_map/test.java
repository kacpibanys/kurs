package com.example.task_11_map;

public class test {
    public static void main(String[] args) {
        TwoKeyMap<String, String, Integer> grades = new NestedTwoKeyHashMap<>();

        grades.put("Alice", "Math", 5);
        grades.put("Alice", "CS", 4);
        grades.put("Bob", "Math", 3);

        System.out.println(grades.get("Alice", "Math"));
        System.out.println(grades.size());
        System.out.println(grades.row("Alice"));
        System.out.println(grades.column("Math"));

        System.out.println("----entrySet-----");
        for (TwoKeyMap.Entry<String, String, Integer> entry : grades.entrySet()) {
            System.out.println(" - [" + entry.getKey1() + ", " + entry.getKey2() + "] = " + entry.getValue());
        }

        System.out.println("----null----");
        grades.put("Charlie", "Physics", null);
        System.out.println(grades.size());

        grades.put("Charlie", "Physics", 4);
        System.out.println(grades.size());

        System.out.println("----nullpointer----");
        try {
            grades.put(null, "Math", 5);
            System.out.println("ERROR: Dupa dupa");
        } catch (NullPointerException e) {
            System.out.println("SUCCESS: dupa dupa");
        }
    }
}
