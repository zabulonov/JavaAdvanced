package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1
        int size = 20;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(21) - 10; // Случайное число от -10 до 10
        }

        System.out.print("Исходный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int maxNegativeIndex = -1;
        int minPositiveIndex = -1;

        for (int i = 0; i < size; i++) {
            if (array[i] < 0 && array[i] > maxNegative) {
                maxNegative = array[i];
                maxNegativeIndex = i;
            }
            if (array[i] > 0 && array[i] < minPositive) {
                minPositive = array[i];
                minPositiveIndex = i;
            }
        }

        System.out.println("Максимальный отрицательный элемент: " + maxNegative);
        System.out.println("Минимальный положительный элемент: " + minPositive);

        if (maxNegativeIndex != -1 && minPositiveIndex != -1) {
            array[maxNegativeIndex] = minPositive;
            array[minPositiveIndex] = maxNegative;
        } else {
            System.out.println("Не удалось найти подходящие элементы для замены.");
        }

        System.out.print("Массив после замены: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во сладостей в подарке:");
        int countSweets = scanner.nextInt();
        Sweet[] sweets = new Sweet[countSweets];
        scanner.nextLine();

        for (int i =0; i<countSweets; i++)
        {
            System.out.println("Введите сладость(Название, вес, цена):");
            String name = scanner.nextLine();
            float weight = scanner.nextFloat();
            float cost = scanner.nextFloat();
            Sweet sweet = new Sweet(name, weight, cost);
            sweets[i] = sweet;
            scanner.nextLine();
        }
        scanner.close();
        Gift gift = new Gift(sweets);
        System.out.println(gift.getSweetsInfo());
    }
}