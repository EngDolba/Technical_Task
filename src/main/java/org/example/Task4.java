package org.example;

public class Task4 {
    static class Solution {
        public String addBinary(String a, String b) {
            if (a.isEmpty() && b.isEmpty()) return "0";
            if (a.length() > b.length()) {
                StringBuilder bBuilder = new StringBuilder(b);
                while (a.length() > bBuilder.length())
                    bBuilder.insert(0, "0");
                b = bBuilder.toString();
            }
            if (b.length() > a.length()) {
                StringBuilder aBuilder = new StringBuilder(a);
                while (b.length() > aBuilder.length())
                    aBuilder.insert(0, "0");
                a = aBuilder.toString();
            }
            System.out.println(a + " " + b);
            boolean carry = false;
            StringBuilder cBuilder = new StringBuilder();
            for (int i = a.length() - 1; i > -1; i--) {
                int bla = a.charAt(i) + b.charAt(i) - '0' - '0';
                System.out.println(bla);
                if (bla == 2) {
                    if (carry) {
                        cBuilder.insert(0, '1');
                    } else {
                        cBuilder.insert(0, '0');
                        carry = true;
                    }
                }
                if (bla == 0) {
                    if (carry) {
                        cBuilder.insert(0, '1');
                        carry = false;
                    } else cBuilder.insert(0, '0');
                }
                if (bla == 1) {
                    if (carry) {
                        cBuilder.insert(0, '0');
                    } else cBuilder.insert(0, '1');
                }
            }
            String c = cBuilder.toString();
            if (carry) return 1 + c;
            else return c;
        }
    }

}
