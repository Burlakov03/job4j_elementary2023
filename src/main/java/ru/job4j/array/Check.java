package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean dateElement : data) {
            if (dateElement != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
