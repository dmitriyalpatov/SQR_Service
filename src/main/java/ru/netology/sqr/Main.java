package ru.netology.sqr;

public class Main {

    public static void main(String[] args, int square) {

        SQRService service = new SQRService();

        int x = service.squaring(square);

        System.out.println(x);

    }


}
