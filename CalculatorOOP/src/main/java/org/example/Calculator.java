package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
        try {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.println("Выберите операцию (+, -, *, /): ");
            char operator = scanner.next().charAt(0);


            Operation operation = switch (operator) {
                case '+' -> new Addition();
                case '-' -> new Subtraction();
                case '*' -> new Multiplication();
                case '/' -> new Division();
                default -> throw new IllegalArgumentException("Некорректная операция");
            };

            double result = operation.calculate(num1, num2);
            System.out.println("Результат: " + result);

            System.out.print("Продолжить вычисления? (да/нет): ");
            String answer = scanner.next();
            continueCalculating = answer.equalsIgnoreCase("да");
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        }
    }
}