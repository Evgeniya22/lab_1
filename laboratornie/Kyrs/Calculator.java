package Kyrs;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("\nДобро пожаловать в инженерный калькулятор!");
        System.out.println("FAQ");
        System.out.println("Вам доступны следующие операции: ");
        System.out.println("+                   : сложение двух чисел");
        System.out.println("-                   : вычитание второго числа из первого");
        System.out.println("*                   : умножение двух чисел");
        System.out.println("/                   : деление первого числа на второе");
        System.out.println("^                   : возведение первого числа в степень второго числа");
        System.out.println("log                 : натуральный логарифм первого числа");
        System.out.println("sin, cos, tan       : синус, косинус и тангенс первого числа (в градусах)");
        System.out.println("exp                 : экспонента в степени первого числа");
        System.out.println("asin, acos, atan    : арксинус, арккосинус и арктангенс первого числа (результат в градусах)");
        System.out.println("sinh, cosh, tanh    : гиперболический синус, косинус и тангенс первого числа");
        System.out.println("log10               : десятичный логарифм первого числа");
        System.out.println("asinh, acosh, atanh : обратный гиперболический синус, косинус и тангенс первого числа");
        System.out.println("factorial           : факториал первого числа (должно быть неотрицательным целым числом)");
        System.out.println("sqrt                : квадратный корень от первого числа");
        System.out.println("cbrt                : кубический корень от первого числа");
        System.out.println("nroot               : корень n-ой степени от первого числа (второе число - степень)");
        System.out.println("\nВведите первое число:");

        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();

        System.out.println("Введите операцию:");
        String operation = scanner.next();

        double num2;
        if (!operation.equals("sqrt") && !operation.equals("log") && !operation.equals("sin") && !operation.equals("cos") && !operation.equals("tan") && !operation.equals("exp") && !operation.equals("asin") && !operation.equals("acos") && !operation.equals("atan") && !operation.equals("sinh") && !operation.equals("cosh") && !operation.equals("tanh") && !operation.equals("log10") && !operation.equals("asinh") && !operation.equals("acosh") && !operation.equals("atanh") && !operation.equals("factorial")) {
            System.out.println("Введите второе число:");
            num2 = scanner.nextDouble();
        } else {
            num2 = 0;
        }

        scanner.close();
        double result;

        switch (operation)  {
            case "+":
                System.out.println("Результат: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Результат: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Результат: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Результат: " + (num1 / num2));
                } else {
                    System.out.println("Ошибка: деление на ноль");
                }
                break;
            case "^":
                System.out.println("Результат: " + Math.pow(num1, num2));
                break;
            case "sqrt":
                if (num1 >= 0) {
                    System.out.println("Результат: " + Math.sqrt(num1));
                } else {
                    System.out.println("Ошибка: корень из отрицательного числа");
                }
                break;
            case "log":
                if (num1 > 0) {
                    System.out.println("Результат: " + Math.log(num1));
                } else {
                    System.out.println("Ошибка: логарифм отрицательного числа или ноля");
                }
                break;
            case "sin":
                System.out.println("Результат: " + Math.sin(Math.toRadians(num1)));
                break;
            case "cos":
                System.out.println("Результат: " + Math.cos(Math.toRadians(num1)));
                break;
            case "tan":
                System.out.println("Результат: " + Math.tan(Math.toRadians(num1)));
                break;
            case "exp":
                System.out.println("Результат: " + Math.exp(num1));
                break;
            case "asin":
                if(num1 >= -1 && num1 <= 1){
                    System.out.println("Результат: " + Math.toDegrees(Math.asin(num1)));
                } else {
                    System.out.println("Ошибка: значение должно быть в диапазоне [-1, 1]");
                }
                break;
            case "acos":
                if(num1 >= -1 && num1 <= 1){
                    System.out.println("Результат: " + Math.toDegrees(Math.acos(num1)));
                } else {
                    System.out.println("Ошибка: значение должно быть в диапазоне [-1, 1]");
                }
                break;
            case "atan":
                System.out.println("Результат: " + Math.toDegrees(Math.atan(num1)));
                break;
            case "sinh":
                System.out.println("Результат: " + Math.sinh(num1));
                break;
            case "cosh":
                System.out.println("Результат: " + Math.cosh(num1));
                break;
            case "tanh":
                System.out.println("Результат: " + Math.tanh(num1));
                break;
            case "log10":
                if (num1 > 0) {
                    System.out.println("Результат: " + Math.log10(num1));
                } else {
                    System.out.println("Ошибка: логарифм отрицательного числа или ноля");
                }
                break;
            case "asinh":
                System.out.println("Результат: " + Math.log(num1 + Math.sqrt(num1 * num1 + 1)));
                break;
            case "acosh":
                if(num1 >= 1) {
                    System.out.println("Результат: " + Math.log(num1 + Math.sqrt(num1 * num1 - 1)));
                } else {
                    System.out.println("Ошибка: значение должно быть больше или равно 1");
                }
                break;
            case "atanh":
                if(num1 > -1 && num1 < 1) {
                    System.out.println("Результат: " + 0.5 * Math.log((1 + num1) / (1 - num1)));
                } else {
                    System.out.println("Ошибка: значение должно быть в диапазоне (-1, 1)");
                }
                break;
            case "factorial":
                if(num1 >= 0 && (int)num1 == num1) {
                    int result2 = 1;
                    for(int i = 1; i <= num1; i++) {
                        result2 *= i;
                    }
                    System.out.println("Результат: " + result2);
                } else {
                    System.out.println("Ошибка: факториал не определен для отрицательных чисел или дробных чисел");
                }
                break;
            case "cbrt":
                result = Math.cbrt(num1);
                System.out.println("Результат: " + result);
                break;
            case "nroot":
                if(num2 == 0){
                    System.out.println("Ошибка: степень корня не может быть равной нулю");
                    return;
                }
                result = Math.pow(num1, 1.0 / num2);
                System.out.println("Результат: " + result);
                break;
            default:
                System.out.println("Неверная операция");
        }
    }
}
