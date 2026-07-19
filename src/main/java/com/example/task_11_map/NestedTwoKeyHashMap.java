package com.example.task_11_map;

import java.util.*;
import java.util.function.Consumer;

public class NestedTwoKeyHashMap<K1, K2, V> implements TwoKeyMap<K1, K2, V> {

    private final Map<K1, Map<K2, V>> data = new HashMap<>();
    private int size = 0;

    @Override
    public V put(K1 k1, K2 k2, V value) {
        checkNotNull(k1, "key1");
        checkNotNull(k2, "key2");
        Map<K2, V> innerMap = data.get(k1);
        if (innerMap == null) {
            innerMap = new HashMap<>();
            data.put(k1, innerMap);
        }
        boolean isNewKey = !innerMap.containsKey(k2);
        V previousValue = innerMap.put(k2, value);

        if (isNewKey) {
            size++;
        }

        return previousValue;
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
        checkNotNull(k1, "key1");
        checkNotNull(k2, "key2");
        Map<K2, V> innerMap = data.get(k1);
        if (innerMap == null) {
            return null;
        }

        boolean hasKey = innerMap.containsKey(k2);
        V previousValue = innerMap.remove(k2);

        if (hasKey) {
            size--;
            if (innerMap.isEmpty()) {
                data.remove(k1);
            }
        }

        return previousValue;
    }


    @Override
    public boolean containsKeys(K1 k1, K2 k2) {
        Map<K2, V> innerMap = data.get(k1);
        return innerMap != null && innerMap.containsKey(k2);
    }

    @Override
    public boolean containsValue(V value) {
        for (Map<K2, V> innerMap : data.values()) {
            if (innerMap.containsValue(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Set<Entry<K1, K2, V>> entrySet() {
        Set<Entry<K1, K2, V>> result = new HashSet<>();
        for (Map.Entry<K1, Map<K2, V>> mainEntry : data.entrySet()) {
            K1 k1 = mainEntry.getKey();

            for (Map.Entry<K2, V> innerEntry : mainEntry.getValue().entrySet()) {
                K2 k2 = innerEntry.getKey();
                V value = innerEntry.getValue();

                result.add(new SimpleEntry(k1, k2, value));
            }
        }
        return result;
    }

    @Override
    public Set<Pair<K1, K2>> keySet() {
        Set<Pair<K1, K2>> result = new HashSet<>();
        for (Map.Entry<K1, Map<K2, V>> mainEntry : data.entrySet()) {
            for (K2 innerKey : mainEntry.getValue().keySet()) {
                result.add(new Pair<>(mainEntry.getKey(), innerKey));
            }
        }
        return result;
    }

    @Override
    public Collection<V> values() {
        List<V> result = new ArrayList<>();
        for (Map<K2, V> innerMap : data.values()) {
            result.addAll(innerMap.values());
        }
        return result;
    }

    @Override
    public void putAll(TwoKeyMap<? extends K1, ? extends K2, ? extends V> other) {
        for (TwoKeyMap.Entry<? extends K1, ? extends K2, ? extends V> entry : other.entrySet()) {
            put(entry.getKey1(), entry.getKey2(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        data.clear();
        size = 0;
    }

    @Override
    public Map<K2, V> row(K1 k1) {
        Map<K2, V> innerMap = data.get(k1);
        if (innerMap == null) {
            return Map.of();
        }
        return innerMap;
    }

    @Override
    public Map<K1, V> column(K2 k2) {
        Map<K1, V> result = new HashMap<>();
        for (Map.Entry<K1, Map<K2, V>> mainEntry : data.entrySet()) {
            Map<K2, V> innerMap = mainEntry.getValue();

            if (innerMap.containsKey(k2)) {
                result.put(mainEntry.getKey(), innerMap.get(k2));
            }
        }
        return result;
    }

    @Override
    public Iterator<Entry<K1, K2, V>> iterator() {
        return entrySet().iterator();
    }

    @Override
    public void forEach(Consumer<? super Entry<K1, K2, V>> action) {
        TwoKeyMap.super.forEach(action);
    }

    @Override
    public Spliterator<Entry<K1, K2, V>> spliterator() {
        return TwoKeyMap.super.spliterator();
    }

    private class SimpleEntry implements TwoKeyMap.Entry<K1, K2, V> {
        private final K1 k1;
        private final K2 k2;
        private V value;

        public SimpleEntry(K1 k1, K2 k2, V value) {
            this.k1 = k1;
            this.k2 = k2;
            this.value = value;
        }

        @Override
        public K1 getKey1() {
            return k1;
        }

        @Override
        public K2 getKey2() {
            return k2;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }
    }
}
