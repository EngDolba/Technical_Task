package org.example;

import java.util.HashMap;

public class Task5 {
    final HashMap<Integer, Integer> map = new HashMap<>();

    public int countVariants(int stearsCount) {
        if (stearsCount == 1) return 1;
        if (stearsCount == 2) return 2;
        if (map.get(stearsCount) == null) {
            int a = countVariants(stearsCount - 2) + countVariants(stearsCount - 1);
            map.put(stearsCount, a);
            return a;
        }
        return map.get(stearsCount);
    }
}
