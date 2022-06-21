package ru.netology.sqr;

public class Main {

    public static int square;

    public static void main(String[] args) {

        SQRService service = new SQRService();

        int solutions = service.squaring(200, 300);

        System.out.println(solutions);

    }


}
