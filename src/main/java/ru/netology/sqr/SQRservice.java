package ru.netology.sqr;

public class SQRservice {
    public int calculate(int min, int max) {
        for (int i = 10; i <= min; min++) {
            if (i * min >= max ) {
                return min;
            }
        }
        return 0;
    }
}
