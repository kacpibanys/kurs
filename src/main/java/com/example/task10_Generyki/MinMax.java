package com.example.task10_Generyki;

public final class MinMax {
    private MinMax() {
    }

    public static <T extends Comparable<? super T>> Pair<T, T> minMax(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array cannot be null or empty");
        }
        T min = arr[0];
        T max = arr[0];
        if (min == null) {
            throw new IllegalArgumentException("elements cannot be null");
        }
        for (int i = 0; i < arr.length; i++) {
            T current = arr[i];
            if (current == null) {
                throw new IllegalArgumentException("element cannot be null");
            }

            if (current.compareTo(min) < 0) {
                min = current;
            } else if (current.compareTo(max) > 0) {
                max = current;
            }
        }

        return Pair.of(min, max);
        // zwróć parę (min, max); pusta tablica → IllegalArgumentException
    }
}