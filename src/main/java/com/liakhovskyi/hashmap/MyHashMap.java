package com.liakhovskyi.hashmap;

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

}
