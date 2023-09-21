package org.example;

import java.util.HashSet;


public class Task3 {
    public int notContains(int[] array) {
        HashSet<Integer> s = new HashSet<>();
        for (int j : array) {
            s.add(j);
        }
        int i = 1;
        while (true) {
            if (!s.contains(i)) return i;
            else i++;
        }
    }
}
