package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task2Test {

    @Test
    public void testMinSplit() {
        Task2 calculator = new Task2();

        // Test when amount is 0
        int result1 = calculator.minSplit(0);
        assertEquals(0, result1);

        // Test when amount is 1
        int result2 = calculator.minSplit(1);
        assertEquals(1, result2);

        // Test when amount is 25
        int result3 = calculator.minSplit(25);
        assertEquals(2, result3); // 20 + 5 = 2 coins

        // Test when amount is 70
        int result4 = calculator.minSplit(70);
        assertEquals(2, result4); // 50 + 20 = 2 coins

        // Test when amount is 99
        int result5 = calculator.minSplit(99);
        assertEquals(6, result5); // 50 + 20 + 20 + 5 + 2 + 2 = 6 coins

        // Test when amount is 37
        int result6 = calculator.minSplit(37);
        assertEquals(4, result6); // 20 + 10 + 5 + 2 = 4 coins

        // Test when amount is negative
        int result7 = calculator.minSplit(-5);
        assertEquals(-1, result7);


    }
}
