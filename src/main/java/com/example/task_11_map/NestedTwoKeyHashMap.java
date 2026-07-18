package com.example.task_11_map;

import com.example.task_10_Generyki.Pair;

import java.util.*;
import java.util.function.Consumer;

public class NestedTwoKeyHashMap<K1, K2, V> implements TwoKeyMap<K1, K2, V> {

    private final Map<K1, Map<K2, V>> data = new HashMap<>();
    private int size = 0;

    @Override
    public V put(K1 k1, K2 k2, V value) {
        return null;
    }

    @Override
    public V get(K1 k1, K2 k2) {
        checkNotNull(k1, "key1");
        checkNotNull(k2, "key2");
        Map<K2, V> inner = data.get(k1);
        return (inner != null) ? inner.get(k2) : null;
    }

    private void checkNotNull(Object key, String text) {
        Objects.requireNonNull(key, text);
    }

    @Override
    public V remove(K1 k1, K2 k2) {
        return null;
    }



    @Override
    public boolean containsKeys(K1 k1, K2 k2) {
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Set<Entry<K1, K2, V>> entrySet() {
        return Set.of();
    }

    @Override
    public Set<Pair<K1, K2>> keySet() {
        return Set.of();
    }

    @Override
    public Collection<V> values() {
        return List.of();
    }

    @Override
    public void putAll(TwoKeyMap<? extends K1, ? extends K2, ? extends V> other) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Map<K2, V> row(K1 k1) {
        return Map.of();
    }

    @Override
    public Map<K1, V> column(K2 k2) {
        return Map.of();
    }

    @Override
    public Iterator<Entry<K1, K2, V>> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Entry<K1, K2, V>> action) {
        TwoKeyMap.super.forEach(action);
    }

    @Override
    public Spliterator<Entry<K1, K2, V>> spliterator() {
        return TwoKeyMap.super.spliterator();
    }
}
