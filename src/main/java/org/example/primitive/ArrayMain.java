package org.example.primitive;

import java.util.Arrays;

import static org.example.Util.print;

public class ArrayMain {
    public static void main(String[] args) {
        // for(;;) is an infinite loop

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int[] arr;
        // int arr2[]; c style is ok

        arr = new int[10]; // Default value of all indexes is from 0 to 9 is 0

        double[] arr3 = new double[10];
        boolean[] arr4 = new boolean[10];

        int[] arr5 = {0, 3, 2, 1};
        Arrays.sort(arr5);
        System.out.println("Sorted:" + Arrays.toString(arr5)); // Sorted for later

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};              // new not required
        int[][] matrix2 = new int[][] {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }

        String[] strings = new String[] {"one", "two", "six", "eight", "ten", "five"};
        Arrays.sort(strings);
        print(strings);                                // [eight, five, one, six, ten, two]
        int index = Arrays.binarySearch(arr5, 3); // Must be sorted (random otherwise) and returns -1 if not found
        System.out.println("Found 3 at: " + index);    // 3
    }
}