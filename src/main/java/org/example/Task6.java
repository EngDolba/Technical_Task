package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task6<K, V> {
    private Object[] elements;
    private int size;

    public Task6(int capacity) {
        elements = new Object[capacity];
        size = 0;
    }

    public static void main(String[] args) {
        Task6<String, Integer> ds = new Task6<>(3);

        ds.insert("one", 1);
        ds.insert("two", 2);
        ds.insert("three", 3);

        System.out.println(ds.get("two")); // Output: 2

        ds.remove("two");

        // Iterating through keys
        for (String key : ds.keys()) {
            System.out.println(key + ": " + ds.get(key));
        }
    }

    public void insert(K key, V value) {
        if (size >= elements.length) {
            // If the array is full, double its size
            resizeArray();
        }
        elements[size++] = new Entry<>(key, value);
    }

    public void remove(K key) {
        for (int i = 0; i < size; i++) {
            Entry<K, V> entry = (Entry<K, V>) elements[i];
            if (entry.key.equals(key)) {
                // Move the last element to the position of the removed element
                elements[i] = elements[size - 1];
                elements[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public V get(K key) {
        for (int i = 0; i < size; i++) {
            Entry<K, V> entry = (Entry<K, V>) elements[i];
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null; // Key not found
    }

    public Iterable<K> keys() {
        List<K> keys = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Entry<K, V> entry = (Entry<K, V>) elements[i];
            keys.add(entry.key);
        }
        return keys;
    }

    private void resizeArray() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    private static class Entry<K, V> {
        final K key;
        final V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

