package com.example.task_11_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Task5 {
    static void main(String[] args) {
        UnaryOperator<List<Integer>> removeNegatives = lista -> {
            for (int i = lista.size() - 1; i >= 0; i--) {
                if (lista.get(i) < 0) {
                    lista.remove(i);
                }
            }
            return lista;
        };
        BinaryOperator<Integer> maxOp = (liczba1, liczba2) -> liczba1 > liczba2 ? liczba1 : liczba2;

        List<Integer> nums = new ArrayList<>(Arrays.asList(3, -1, 7, -5, 10, 0));

        removeNegatives.apply(nums);
        System.out.println("no negatives: " + nums);

        if (!nums.isEmpty()) {
            int max = nums.get(0);
            for (int i = 1; i < nums.size(); i++) {
                max = maxOp.apply(max, nums.get(i));
            }
            System.out.println("biggest: " + max);
        } else {
            System.out.println("list is empty");
        }

    }
}