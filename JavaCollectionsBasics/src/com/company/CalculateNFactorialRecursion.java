package com.company;


import java.util.Scanner;

public class CalculateNFactorialRecursion {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(CalcucateRecursion(n));
    }

    private static int CalcucateRecursion(int n) {
        return n < 1 ? 1 : n * CalcucateRecursion(n - 1);
    }
}
