package com.hakkerrank.task9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PriyankaAndToys {


    private static final Scanner scanner = new Scanner(System.in);

    // Complete the toys function below.
    private static int toys(final int[] w) {
        Arrays.sort(w);
        int cost = 1;
        int p = w[0];
        for (final int j : w) {
            if (j > p + 4) {
                cost++;
                p = j;
            }
        }
        return cost;
    }

    public static void main(String[] args) throws IOException {
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final int[] w = new int[n];

        final String[] wItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(wItems[i]);
        }

        final int result = toys(w);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
