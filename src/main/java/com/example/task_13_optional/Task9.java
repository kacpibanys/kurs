package com.example.task_13_optional;

import java.util.List;
import java.util.Optional;

public class Task9 {
    static String describeGrade(Optional<Integer> grade){
        return grade.filter(g -> g >=4)
                .map(g -> "Dobra ocena: " + g)
                .orElse("Pominieto");
    }

    static void main(String[] args) {
        List<Optional<Integer>> oceny = List.of(
                Optional.of(5), Optional.of(3), Optional.empty(),
                Optional.of(4), Optional.of(2), Optional.of(5)
        );
        for (Optional<Integer> grade : oceny) {
            System.out.println(describeGrade(grade));
        }
    }
}
