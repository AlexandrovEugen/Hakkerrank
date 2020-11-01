package com.hakkerrank.task5;

import java.util.Scanner;

public class Staircase {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        stairCase(n);

        scanner.close();
    }

    private static void stairCase(int n) {
        StringBuilder stair = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                stair.append(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                stair.append("#");
            }
            System.out.println(stair);
            stair = new StringBuilder();
        }
    }

}
