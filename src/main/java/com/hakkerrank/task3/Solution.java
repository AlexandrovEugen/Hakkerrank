package com.hakkerrank.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {


    public static void main(String[] args) throws IOException {

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final int n = Integer.parseInt(bufferedReader.readLine().trim());

        final List<List<Integer>> matrix = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                matrix.add(Stream.of(bufferedReader
                        .readLine()
                        .replaceAll("\\s + $", "")
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()));
            } catch (IOException e) {
                throw new RuntimeException();
            }
        });

        final int result = Result.diagonalDiv(matrix);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }


    private static class Result {

        public static int diagonalDiv(List<List<Integer>> matrix) {
            int straightLine = 0;
            int reverseLine = 0;
            for (int i = 0; i < matrix.size(); i++) {
                straightLine += matrix.get(i).get(i);
                reverseLine += matrix.get(matrix.size() - 1 - i).get(i);
            }

            return Math.abs(straightLine - reverseLine);
        }

    }

}
