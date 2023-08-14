package org.utkarsh.day1.u001_Matrix_Zero;

import java.util.Arrays;

public class Main {
    static int[][] setMatrixZeroes(int[][] arr) {
        int corner = 1;
        int i = 0, j = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    if (j != 0) {
                        arr[0][j] = 0;
                    } else {
                        corner = 0;
                    }
                    arr[i][0] = 0;
                }
            }
        }
        for (i = arr.length - 1; i > 0; i--) {
            for (j = arr[0].length - 1; j > 0; j--) {
                if (arr[i][j] != 0) {
                    if (arr[0][j] == 0 || arr[i][0] == 0) {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        if (arr[0][0] == 0) {
            for (j = arr[0].length - 1; j > 0; j--) {
                arr[0][j] = 0;
            }
        }
        if (corner == 0) {
            for (i = 0; i < arr.length; i++) {
                arr[i][0] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4}, {1, 3, 4}, {1, 0, 5}};
        System.out.println(Arrays.deepToString(setMatrixZeroes(arr)));
    }
}