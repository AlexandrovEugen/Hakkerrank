package com.hakkerrank.task7;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BirthdayCakeCandles {


    public static void main(String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        final List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        final int result = Result.birthdayCakeCandles(candles);


        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    private static class Result {
        public static int birthdayCakeCandles(List<Integer> candles) {
            int count = 1;
            Integer max = 0;
            for (final Integer candle : candles) {
                if (candle.equals(max)) {
                    count++;
                }
                if (candle.compareTo(max) > 0) {
                    max = candle;
                    count = 1;
                }
            }
            return count;
        }
    }
}

