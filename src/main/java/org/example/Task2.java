package org.example;

public class Task2 {
    public int minSplit(int amount) {
        if (amount < 0) return -1;
        int moneyCount = 0;

        moneyCount += amount / 50;
        amount %= 50;

        moneyCount += amount / 20;
        amount %= 20;

        moneyCount += amount / 10;
        amount %= 10;

        moneyCount += amount / 5;
        amount %= 5;

        moneyCount += amount / 2;
        amount %= 2;

        moneyCount += amount;

        return moneyCount;
    }
}
