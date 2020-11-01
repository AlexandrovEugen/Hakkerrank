package com.hakkerrank.task6;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {


    private static final Scanner scanner = new Scanner(System.in);

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long minSum = 0L;
        long maxSum = 0L;
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length -1){
                minSum += arr[i];
            }
            if (i != 0){
                maxSum +=arr[i];
            }
        }
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        final int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }


}
