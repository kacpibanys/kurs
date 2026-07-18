package com.example.task_10_Generyki;

import java.util.Arrays;

public class ArrayUtilsTest {
    static void main(String[] args) {
        System.out.println("--------------------swap ");
        String[] a = {"A", "B", "C"};
        System.out.println("przed swap: " + Arrays.toString(a));
        ArrayUtils.swap(a, 0, 2);
        System.out.println("po swap: " + Arrays.toString(a));

        System.out.println("--------------------walidacja");
        Integer[] nums = {1, 2, 3};

        try {
            ArrayUtils.swap(nums, -1, 0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("wyjatek: " + e.getClass().getSimpleName());
        }

        try {
            ArrayUtils.swap(nums, 0, 3);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("wyjatek: " + e.getClass().getSimpleName());
        }


        System.out.println("--------------------no-op");
        String[] x = {"X", "Y"};
        System.out.println("przed swap: " + Arrays.toString(x));
        ArrayUtils.swap(x, 1, 1);
        System.out.println("po swap: " + Arrays.toString(x));


        System.out.println("--------------------null");
        try {
            ArrayUtils.swap(null, 0, 1);
        } catch (NullPointerException e) {
            System.out.println("wyjatek: " + e.getClass().getSimpleName());
        }

        System.out.println("--------------------first");
        String[] s1 = {null, "a", null, "b", "a"};

        System.out.println("indexOf(null): " + ArrayUtils.indexOf(s1, null));

        System.out.println("lastIndexOf(null): " + ArrayUtils.lastIndexOf(s1, null));

        System.out.println("indexOf(\"a\"): " + ArrayUtils.indexOf(s1, "a"));

        System.out.println("lastIndexOf(\"a\"): " + ArrayUtils.lastIndexOf(s1, "a"));

        System.out.println("--------------------last");
        String[] s2 = {"x", "y"};

        System.out.println("indexOf(\"zzz\"): " + ArrayUtils.indexOf(s2, "zzz"));

        System.out.println("--------------------equals");
        Integer[] aE = {1, null, 3};
        Integer[] b = {1, null, 3};

        System.out.println("arraysEqual(a, b): " + ArrayUtils.arraysEqual(aE, b));

        Integer[] c = {1, 2, 3};

        System.out.println("arraysEqual(a, c): " + ArrayUtils.arraysEqual(aE, c));


        String[] arrA = {"x"};
        String[] arrB = null;
        String[] nullArr1 = null;
        String[] nullArr2 = null;

        System.out.println("arraysEqual(arrA, arrB): " + ArrayUtils.arraysEqual(arrA, arrB));

        System.out.println("arraysEqual(null, null): " + ArrayUtils.arraysEqual(nullArr1, nullArr2));
    }

}

