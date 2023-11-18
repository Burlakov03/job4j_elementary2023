package ru.job4j.calculator;

public class Calculator {

    public static void plus(int one, int two) {
        System.out.println(one + two);
    }

    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        Calculator.plus(1, 5);
        Calculator.plus(77, 8);
        Calculator.plus(10, 55);
        int result3 = Calculator.func1(100);
    }
}
