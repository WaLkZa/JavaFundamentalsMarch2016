package com.company;

import java.util.Scanner;

public class CalculateNFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int factorial = scanner.nextInt();
        long result = 1;

        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
