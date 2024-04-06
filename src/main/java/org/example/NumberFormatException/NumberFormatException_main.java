package org.example.NumberFormatException;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя ввод числа,
а затем пытается преобразовать введенную строку в целое число.
Обработайте случай, когда введенная строка не является корректным числом,
с использованием исключения NumberFormatException в классе getResult.
 */
public class NumberFormatException_main {
    public static void main(String args[]) {
    }
    public static int getResult() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Вы ввели число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Невозможно преобразовать введенную строку в число!");
        }
        return 0;
    }
    }
