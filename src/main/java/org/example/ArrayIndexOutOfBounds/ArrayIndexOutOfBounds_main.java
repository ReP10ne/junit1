package org.example.ArrayIndexOutOfBounds;
/*
Напишите программу, которая создает массив целых чисел и пытается получить доступ к элементу по индексу,
который находится за пределами допустимого диапазона.
Обработайте случай выхода за границы массива с использованием исключения ArrayIndexOutOfBoundsException в классе getResult.
*/
public class ArrayIndexOutOfBounds_main {
    public static void main(String[] args) {
        getResult();
    }

        public static void getResult(){
            int[] array = {1, 2, 3, 4, 5};

            try {
                for (int i = 0; i <= array.length; i++) {
                    int element = array[i];
                    System.out.println("Элемент " + i + ": " + element);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива");
            }
        }
    }
