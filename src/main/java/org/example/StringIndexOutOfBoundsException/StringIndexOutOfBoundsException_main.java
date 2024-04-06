package org.example.StringIndexOutOfBoundsException;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя ввод строки
и пытается получить доступ к символу строки по указанному индексу.
Обработайте случай, когда индекс выходит за границы строки,
с использованием исключения StringIndexOutOfBoundsException в классе getResult.
 */
public class StringIndexOutOfBoundsException_main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        try {
            char ch = input.charAt(input.length()); // Попытка доступа к символу строки за пределами ее длины
            System.out.println("Символ: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Выход за пределы строки!");
        }
    }
}