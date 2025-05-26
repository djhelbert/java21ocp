package org.example.primitive;

import static org.example.Util.*;
import java.util.Arrays;

public class ArrayMain {
    public static void main(String args[]) {
        // for(;;) is an infinite loop

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int[] arr;
        int arr2[];

        arr = new int[10];

        double[] arr3 = new double[10];
        boolean[] arr4 = new boolean[10];

        int[] arr5 = {0, 3, 2, 1};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

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

        int[][] matrix2 = new int[10][10];

        print(arr5);
        Arrays.sort(arr5);
        print("Sorted: " + Arrays.toString(arr5));
    }
}
