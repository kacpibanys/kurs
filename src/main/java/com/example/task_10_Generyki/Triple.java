package com.example.task_10_Generyki;

import java.util.Objects;

public final class Triple<T, U, V> {
    private final T first;
    private final U second;
    private final V third;
    private Triple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public static <T,U,V> Triple<T,U,V> of(T first, U second, V third) {
        return new Triple<T,U,V>(first, second, third);
    }

    public T first() {
        return first;
    }
    public U second() {
        return second;
    }
    public V third() {
        return third;
    }

    @Override public boolean equals(Object o) {
        /* porównanie 3 pól */
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triple<?, ?, ?> triple = (Triple<?, ?, ?>) o;
        return Objects.equals(first, triple.first) &&
                Objects.equals(second, triple.second) &&
                Objects.equals(third, triple.third);

    }
    @Override public int hashCode() {
        /* spójny z equals */
        return Objects.hash(first, second, third);
    }
    @Override public String toString() {
        /* np. "Triple[first=..., second=..., third=...]" */
        return "Triple[first=" + first + ", second=" + second + ", third=" + third + "]";}
}