package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StopWatch rolex = new StopWatch();
        rolex.start();
        System.out.println(rolex.getStartTime());
        sub();
        rolex.end();
        System.out.println(rolex.getEndTime());
        System.out.println(rolex.getElapsedTime());
    }

    public static void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("Enter element in row " + (row + 1) + " and column " + (col + 1) + " : \t");
                matrix[row][col] = sc.nextInt();
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
        int sum;
        int max = 0;
        int count = 0;
        for (int col = 0; col < matrix[0].length; col++) {
            sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            };
            if (max < sum) {
                max = sum;
                count++;
            };

        }
        System.out.println("Max sum is: " + max + " in column " + count);
    }
}
