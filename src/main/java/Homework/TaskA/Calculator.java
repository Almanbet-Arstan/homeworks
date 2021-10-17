package Homework.TaskA;

public class Calculator {
    // метод который считывает
    public static int calculate(int a, int b, String operation) {
        if(divideByZero(b, operation)) {
            return switch (operation) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> 0;
            };
        }
        return 0;
    }

    // метод который проверяет чтобы мы не делили на 0
    public static boolean divideByZero(int b, String operation) {
        if(operation.equals("/") && b == 0) return false;
        return true;
    }
}
