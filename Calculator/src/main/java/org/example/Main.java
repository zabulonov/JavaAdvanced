package org.example;

import java.util.Scanner;

/**
 * Главный класс для выполнения арифметических операций и поиска самого длинного слова.
 *
 * @author Alexey Zabulolov
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                // Калькулятор
                System.out.println("Enter the first number:");
                double firstNumber = scanner.nextDouble();
                System.out.println("Enter the second number:");
                double secondNumber = scanner.nextDouble();
                System.out.println("Enter operation (+, -, *, /):");
                char action = scanner.next().charAt(0);
                scanner.close();
                try {
                    double result = calc(firstNumber, secondNumber, action);
                    System.out.printf("Calculation result is %.4fn", result);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                break;

            case 2:
                // Поиск максимального слова
                System.out.println("Enter the size of the array:");
                int size = scanner.nextInt();
                String[] words = new String[size];
                scanner.nextLine(); // Очистка буфера
                System.out.println("Enter " + size + " words:");
                for (int i = 0; i < size; i++) {
                    words[i] = scanner.nextLine();
                }
                scanner.close();
                String longestWord = findLongestWord(words);
                System.out.println("The longest word is: " + longestWord);
                break;

            default:
                System.err.println("Invalid task number. Please enter 1 or 2.");
                break;
        }
    }

    /**
     * Выполняет арифметическую операцию над двумя числами.
     *
     * @param a      первое число
     * @param b      второе число
     * @param action действие (+, -, *, /)
     * @return результат операции
     * @throws Exception если действие неверное
     */
    public static double calc(double a, double b, char action) throws Exception {
        double ans;
        switch (action) {
            case '+':
                ans = a + b;
                break;
            case '-':
                ans = a - b;
                break;
            case '*':
                ans = a * b;
                break;
            case '/':
                if (b == 0) {
                    throw new Exception("Деление на ноль невозможно.");
                }
                ans = a / b;
                break;
            default:
                throw new Exception("Неверное действие. Используйте +, -, *, /.");
        }
        return ans;
    }

    /**
     * Находит самое длинное слово в массиве.
     *
     * @param words массив слов
     * @return самое длинное слово
     */
    public static String findLongestWord(String[] words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}