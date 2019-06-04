package com.liakhovskyi.hashmap;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

public class MyHashMap {

    private final float LOAD_FACTOR = 0.75f;
    private final int DEFAULT_CAPACITY = 16;
    private int size;
    private MyEntry<Integer, Long>[] values;


    public MyHashMap() {
        values = new MyEntry[DEFAULT_CAPACITY];
    }

    public MyHashMap(int capacity) {
        values = new MyEntry[capacity];
    }

    public int size() {
        return size;
    }

    public Long get(Integer key) {
        MyEntry<Integer, Long> entry;
        int location = index(key.hashCode());
        entry = values[location];
        if (entry != null && entry.getKey().equals(key)) {
            return entry.getValue();
        }
        return null;
    }

    private int index(int hash) {
        return hash % table.length;
    }

}
