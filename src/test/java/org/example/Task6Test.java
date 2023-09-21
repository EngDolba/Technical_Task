package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task6Test {
    private Task6<String, Integer> ds;

    @Before
    public void setUp() {
        ds = new Task6<>(3);

        ds.insert("one", 1);
        ds.insert("two", 2);
        ds.insert("three", 3);
    }

    @Test
    public void testGet() {
        assertEquals(Integer.valueOf(1), ds.get("one"));
        assertEquals(Integer.valueOf(2), ds.get("two"));
        assertEquals(Integer.valueOf(3), ds.get("three"));
        assertNull(ds.get("four"));
    }

    @Test
    public void testRemove() {
        ds.remove("two");
        assertNull(ds.get("two"));
        assertEquals(2, ds.keys().spliterator().getExactSizeIfKnown());
    }

    @Test
    public void testKeys() {
        Iterable<String> keys = ds.keys();
        assertNotNull(keys);
        int count = 0;
        for (String key : keys) {
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testResize() {
        ds.insert("four", 4);
        ds.insert("five", 5);
        ds.insert("six", 6);
        assertEquals(Integer.valueOf(4), ds.get("four"));
        assertEquals(Integer.valueOf(5), ds.get("five"));
        assertEquals(Integer.valueOf(6), ds.get("six"));
    }
}
