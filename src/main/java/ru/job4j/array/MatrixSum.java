package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int sumArray = 0;
        for (int[] arr : array) {
            for (int number : arr) {
                sumArray += number;
            }
        }
        return sumArray;
    }
}
