package com.liakhovskyi.hashmap;

import java.util.Objects;

public class MyEntry<K, V> {
    private final K key;
    private V value;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEntry entry = (MyEntry) o;
        return key == entry.key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
