package com.company;

public class MainMatrix {
    public static void main(String[] args) {
        int[][] matrixA = new int[][] {{1, 2}, {3, 4}};
        int[][] matrixB = new int[][] {{5, 6}, {7, 8}};
        int[][] matrixC = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixD = new int[][] {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

        for (int i = 0; i < 2; i++) {
            int res = matrixA[i][0] * matrixB[0][0] + matrixA[i][1] * matrixB[1][0];
            int res1 = matrixA[i][0] * matrixB[0][1] + matrixA[i][1] * matrixB[1][1];
            System.out.print(res + " ");
            System.out.print(res1 + "\n");
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            int result1 = matrixC[i][0] * matrixD[0][0] + matrixC[i][1] * matrixD[1][0] + matrixC[i][2] * matrixD[2][0];
            int result2 = matrixC[i][0] * matrixD[0][1] + matrixC[i][1] * matrixD[1][1] + matrixC[i][2] * matrixD[2][1];
            int result3 = matrixC[i][0] * matrixD[0][2] + matrixC[i][1] * matrixD[1][2] + matrixC[i][2] * matrixD[2][2];
            System.out.print(result1 + "\t");
            System.out.print(result2 + "\t");
            System.out.print(result3 + "\n");
        }
    }
}
