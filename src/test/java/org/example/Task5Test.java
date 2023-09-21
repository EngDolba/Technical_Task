package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task5Test {

    @Test
    public void testCountVariants() {
        Task5 task5 = new Task5();

        // Test case 1: Stairs with 1 step
        int result1 = task5.countVariants(1);
        assertEquals(1, result1);

        // Test case 2: Stairs with 2 steps
        int result2 = task5.countVariants(2);
        assertEquals(2, result2);

        // Test case 3: Stairs with 3 steps
        int result3 = task5.countVariants(3);
        assertEquals(3, result3);

        // Test case 4: Stairs with 4 steps
        int result4 = task5.countVariants(4);
        assertEquals(5, result4);

        // Test case 5: Stairs with 5 steps
        int result5 = task5.countVariants(5);
        assertEquals(8, result5);

        // Test case 6: Stairs with 6 steps
        int result6 = task5.countVariants(6);
        assertEquals(13, result6);
    }
}
