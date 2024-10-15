package org.example;

import java.util.Scanner;
/**
 * Главный класс для выполнения арифметических операций.
 *
 * @author Alexey Zabulolov
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        char action = scanner.next().charAt(0);
        try {
            double result = calc(firstNumber,secondNumber,action);
            System.out.printf("Calculation result is %.4f", result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Выполняет арифметическую операцию над двумя числами.
     *
     * @author Alexey Zabulolov
     * @param a первое число
     * @param b второе число
     * @param action действие (+, -, *, /)
     * @return результат операции
     * @throws Exception если действие неверное
     */
    public static double calc(double a, double b, char action) throws Exception {
        double ans;
        switch (action){
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
            case '%':
                ans = a % b;
                break;
            default:
                System.err.print("Error with action, try again.");
                throw new Exception("Wrong paramere action in fuction calc(), it must be +,-,/,*,%");
        }
        return ans;
    }
}