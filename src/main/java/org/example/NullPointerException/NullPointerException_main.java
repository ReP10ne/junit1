package org.example.NullPointerException;
/*
Напишите программу, которая создает объект строкового массива и
пытается вызвать метод для получения длины строки в элементе массива.
Обработайте случай, когда элемент массива имеет значение null,
с использованием исключения NullPointerException в классе getResult.
 */
public class NullPointerException_main {
    public static void main(String[] args) {
        String[] array = new String[3];
        array[0] = "Hello";
        array[1] = null;
        array[2] = "World";

        for (String str : array) {
            try {
                int length = str.length();
                System.out.println("Длина строки: " + length);
            } catch (NullPointerException e) {
                System.out.println("Обнаружен null указатель!");
            }
        }
    }
}
