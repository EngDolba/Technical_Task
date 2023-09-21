package org.example;

import java.util.HashSet;


public class Task1 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            int a = set.size();
            set.add(num);
            if (a == set.size()) return num;
        }
        return Integer.MIN_VALUE;
    }
}
