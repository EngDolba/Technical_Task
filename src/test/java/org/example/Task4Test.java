package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task4Test {

    @Test
    public void testAddBinary() {
        Task4 task4 = new Task4();
        Task4.Solution solution = new Task4.Solution();

        // Test case 1: Basic addition
        String result1 = solution.addBinary("110", "101");
        assertEquals("1011", result1);

        // Test case 2: Addition with different lengths
        String result2 = solution.addBinary("11", "10101");
        assertEquals("11000", result2);

        // Test case 3: Addition with carry
        String result3 = solution.addBinary("1111", "1111");
        assertEquals("11110", result3);


        // Test case 5: Addition with one empty string
        String result5 = solution.addBinary("1010", "");
        assertEquals("1010", result5);

        // Test case 6: Addition with both empty strings
        String result6 = solution.addBinary("", "");
        assertEquals("0", result6);
    }
}
