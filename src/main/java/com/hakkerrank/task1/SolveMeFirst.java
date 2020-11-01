package com.hakkerrank.task1;

import java.util.Scanner;

public class SolveMeFirst {


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int firstInt = scanner.nextInt();
        final int secondInt = scanner.nextInt();

        final int sum = sumIt(firstInt, secondInt);

        System.out.println(sum);
    }

    private static int sumIt(final int firstInt, final int secondInt) {
        if (underUpperBound(firstInt) || underUpperBound(secondInt)) {
            return firstInt + secondInt;
        }
        return 0;
    }

    private static boolean underUpperBound(int number) {
        return 1000 >= number;
    }


}
