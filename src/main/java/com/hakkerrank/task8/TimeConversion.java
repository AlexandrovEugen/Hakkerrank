package com.hakkerrank.task8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {


    private static final Scanner scan = new Scanner(System.in);

    /*
     * Complete the timeConversion function below.
     */
    private static String timeConversion(final String date) {
        final String amPM = date.substring(date.length() - 2);
        final String hourOld = date.substring(0, 2);
        String hourNew = hourOld;

        if ("PM".equals(amPM)) {
            if (!"12".equals(hourOld)) {
                hourNew = String.valueOf(12 + Integer.parseInt(hourOld));
            }
        } else {
            if ("12".equals(hourOld)) {
                hourNew = "00";
            }
        }
        return date.replace(amPM, "").replace(hourOld, hourNew);
    }

    public static void main(String[] args) throws IOException {
        final BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        final String s = scan.nextLine();

        final String result = timeConversion(s);

        System.out.println(result);


        bw.write(result);
        bw.newLine();

        bw.close();
    }

}
