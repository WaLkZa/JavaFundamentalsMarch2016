package com.company;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortArrayWithStreamAPI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        String sortedMethod = scanner.nextLine();

        Arrays.stream(numbers)
                .map(Integer::parseInt)
                .sorted(sortedMethod.equals("Ascending") ? Comparator.naturalOrder() : Comparator.reverseOrder())
                .forEach(number -> System.out.printf("%d ", number));
    }
}
