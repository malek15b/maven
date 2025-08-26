package org.example;

public class Main {
    public static void main(String[] args) {
        isPrime(30152);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static boolean istPositive(int number) {
        return number > 0;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int limit = (int) Math.sqrt(number);
        for (int i = 3; i <= limit; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String fizzBuzz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else {
            return "Buzz";
        }
    }

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
