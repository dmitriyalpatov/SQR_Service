package ru.netology.sqr;

public class SQRService {

    public int squaring(int lowerbound, int upperbound) {

        int count = 0;

        int square = 16;

        for (int i = 10; i <= 99; i++) {

            square = i * i;

            if (square >= 200 & square <= 300) {

                count ++;

            }
        }

        return count;
    }


    }

