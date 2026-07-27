package com.example.task10_Generyki;

import java.util.Objects;

public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> void swap(T[] arr, int i, int j) {
        if (arr == null) {
            throw new NullPointerException("arr is null");
        }
        if (i < 0 || j < 0 || i >= arr.length || j >= arr.length) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        boolean check;
        if (i == j) {
            return;
        }

        T swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    public static <T> int indexOf(T[] arr, T value) {
        // pierwszy indeks wystąpienia; brak → -1
        Objects.requireNonNull(arr, "object cannot be  null");
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], value)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int lastIndexOf(T[] arr, T value) {
        // ostatni indeks wystąpienia; brak → -1
        Objects.requireNonNull(arr, "object cannot be  null");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (Objects.equals(arr[i], value)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> boolean arraysEqual(T[] a, T[] b) {
        // true jeśli: ten sam rozmiar i każdy element pary a[i] oraz b[i] jest równy
        // (== dla null, equals dla nie-null)
        if(a == null && b == null) {
            return true;
        }

        if(a == null || b == null) {
            return false;
        }

        if(a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if(!Objects.equals(a[i], b[i])) {
                return false;
            }
        }
        return true;
    }
}