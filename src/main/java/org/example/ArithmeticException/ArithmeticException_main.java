package org.example.ArithmeticException;

/*
Напишите программу, в которой находится два целых числа
и вычисляет результат деления первого числа на второе.
Обработайте случай деления на ноль с использованием исключения ArithmeticException в классе getResult.
*/

public class ArithmeticException_main {
    public static void main(String[] args) {

        System.out.println(getResult());

    }

    public static int getResult() {
        String result = "в данном примере знаменателем является число 0, а на 0 делить нельзя";
        int sum = 0;
        int a = 10;
        int b = 0;
        try {
            sum = a / b;
            System.out.println("ArithmeticException: ");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + result);
        }

        return sum;
    }
}



