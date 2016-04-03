package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FilterArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");

        Arrays.stream(elements)
                .filter(e -> e.length() > 3)
                .forEach(e -> System.out.print(e + " "));
    }
}