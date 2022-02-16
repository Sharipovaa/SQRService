package ru.netology.sqr;

public class SQRservice {
    public int findSquare(int min, int max) {
        for (int i = 0; i < min; i++) {
            if (i * i >= min) {
                return i;
            }
        }
        return max;
    }


    public int findSquareNum(int min, int max) {
        for (int i = 0; i < min; i++) {
            if (i * i >= min) {
                return i;
            }
        }
        return max;
    }
}
