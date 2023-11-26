package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] ages = new String[10];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = String.valueOf(i * i);
        }
        for (String stroka : ages) {
            System.out.println(stroka);
        }
    }
}
