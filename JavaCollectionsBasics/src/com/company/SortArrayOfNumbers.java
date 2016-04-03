package com.company;


import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] numbers = scanner.nextLine().split(" ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        
        arr = bubbleSort(arr);

        for (int number : arr) {
            System.out.print(number + " ");
        }
    }

    public static int[] bubbleSort(int[] arr) {

        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        return arr;
    }
}

