package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task3Test {

    @Test
    public void testNotContains() {
        Task3 task3 = new Task3();

        // Test with an array that contains positive integers
        int[] array1 = {1, 2, 3, 4, 5};
        int result1 = task3.notContains(array1);
        assertEquals(6, result1);

        // Test with an empty array
        int[] array2 = {};
        int result2 = task3.notContains(array2);
        assertEquals(1, result2);

        // Test with an array that contains negative integers
        int[] array3 = {-1, -2, -3, -4};
        int result3 = task3.notContains(array3);
        assertEquals(1, result3);

        // Test with an array that contains duplicates
        int[] array4 = {1, 2, 2, 4, 5};
        int result4 = task3.notContains(array4);
        assertEquals(3, result4);

        // Test with an array that contains a large gap
        int[] array5 = {1, 1000, 1000000};
        int result5 = task3.notContains(array5);
        assertEquals(2, result5);
    }
}
