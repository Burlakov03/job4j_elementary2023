package ru.job4j.converter;

public class Convertor {
    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDolar(float value) {
        return value / 70;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = rubleToDolar(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result: " + passed);
        expected = 1.4F;
        passed = expected == rubleToEuro(in);
        System.out.println("140 rubles are 2. Test result: " + passed);
    }
}
