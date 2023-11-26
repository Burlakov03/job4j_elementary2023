package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        char symbol = input.charAt(0);
        String result = "";
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result = result + symbol;
                if (counter > 1) {
                    result = result + counter;
                    counter = 1;
                }
                symbol = input.charAt(i);
            }
        }
        result = result + symbol;
        if (counter > 1) {
            result = result + counter;
        }
        return result;
    }
}
