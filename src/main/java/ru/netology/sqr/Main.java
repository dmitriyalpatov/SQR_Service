package ru.netology.sqr;

public class Main {

    public static int square;

    public static void main(String[] args) {

        SQRService service = new SQRService();

        int a, b, c;

        a = 16;

        b = 15;

        c = a * b;

        int solutions = service.squaring(200, 300);

        System.out.println("квадрат =" + c);
        System.out.println("количество в пределах допустимых границ="+solutions);
    }


}
