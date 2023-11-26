package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = new int[][]{{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int[] number : numbers) {
            for (int i : number) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}
