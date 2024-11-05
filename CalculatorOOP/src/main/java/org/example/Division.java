package org.example;

class Division extends Operation {
    @Override
    public double calculate(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль запрещено!");
        }
        return a / b;
    }
}