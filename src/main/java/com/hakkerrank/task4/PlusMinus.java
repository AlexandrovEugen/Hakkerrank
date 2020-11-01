package com.hakkerrank.task4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PlusMinus {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final int[] array = new int[n];

        final String[] items = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(items[i]);
        }

        plusMinus(array);

        scanner.close();

    }

    private static void plusMinus(final int[] array) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int totalCount = array.length;

        for (int j : array) {
            if (j > 0) {
                positiveCount++;
            }
            else if (j < 0) {
                negativeCount++;
            }
            else {
                zeroCount++;
            }
        }

        BigDecimal positiveRate = BigDecimal.valueOf(positiveCount * 1.0 / totalCount)
                .setScale(6, RoundingMode.HALF_DOWN);
        BigDecimal negativeRate = BigDecimal.valueOf(negativeCount * 1.0 / totalCount)
                .setScale(6, RoundingMode.HALF_DOWN);
        BigDecimal zeroRate = BigDecimal.valueOf(zeroCount * 1.0 / totalCount)
                .setScale(6, RoundingMode.HALF_DOWN);

        System.out.println(positiveRate);
        System.out.println(negativeRate);
        System.out.println(zeroRate);
    }


}
