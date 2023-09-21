package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task1Test {

    @Test
    public void testFindDuplicate() {
        Task1 finder = new Task1();

        // Test when there's a duplicate
        int[] arr1 = {1, 2, 3, 4, 2};
        int result1 = finder.singleNumber(arr1);
        assertEquals(2, result1);

        // Test when there's a duplicate at the beginning
        int[] arr2 = {3, 3, 4, 5, 6};
        int result2 = finder.singleNumber(arr2);
        assertEquals(3, result2);

        // Test when there's a duplicate at the end
        int[] arr3 = {7, 8, 9, 10, 10};
        int result3 = finder.singleNumber(arr3);
        assertEquals(10, result3);

        // Test with multiple duplicates
        int[] arr4 = {5, 6, 5, 6, 7, 7, 8};
        int result4 = finder.singleNumber(arr4);
        assertEquals(5, result4);

        // Test when there's no duplicate
        int[] arr5 = {1, 2, 3, 4, 5};
        int result5 = finder.singleNumber(arr5);
        assertEquals(Integer.MIN_VALUE, result5);

        // Test with an empty array
        int[] arr6 = {};
        int result6 = finder.singleNumber(arr6);
        assertEquals(Integer.MIN_VALUE, result6);
    }
}
