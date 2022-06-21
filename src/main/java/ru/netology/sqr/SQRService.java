package ru.netology.sqr;

public class SQRService {

    public int squaring(int number) {

        int count = 0;

        for (int i = 10; i <= 99; i++) {

            if (i*i >= number) {

                return i;

            }
        }

        return 0;
    }
}
