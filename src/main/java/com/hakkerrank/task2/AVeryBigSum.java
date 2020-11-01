package com.hakkerrank.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AVeryBigSum {

    private static final Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final int arrayLength = in.nextInt();
        in.skip("(\r\n|[\r\n\u2028\u2029\u0085])?");

        final long[] array = new long[arrayLength];
        in.skip("(\r\n|[\r\n\u2028\u2029\u0085])?");

        final String[] items = in.nextLine().split(" ");

        for (int i = 0; i < arrayLength; i++) {
            final long num = Long.parseLong(items[i]);
            array[i] = num;
        }

        final long sum = sumArray(array);

        bufferedWriter.write(String.valueOf(sum));
        bufferedWriter.newLine();
        bufferedWriter.close();
        in.close();
    }

    private static long sumArray(long[] array) {
        long result = 0L;
        for (final long num : array) {
            result += num;
        }
        return result;
    }
}
