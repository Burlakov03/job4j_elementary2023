package ru.job4j.converter;

public class Convertor {
    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDolar(float value) {
        return value / 70;
    }

    public static void main(String[] args) {
        System.out.println("140 rubles are " + rubleToEuro(140) + " euro.");
        System.out.println("140 rubles are " + rubleToDolar(140) + " dollar.");
    }
}
