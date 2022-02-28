package ru.netology.sqr;

public class SQRservice {
    int count = 0;

    public int findSquare(int min, int max) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                count = count + 1;
            }
        }
        return count;
    }
}
