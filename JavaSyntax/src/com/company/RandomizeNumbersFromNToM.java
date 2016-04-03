package com.company;


import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int min = Math.min(n, m);
        int max = Math.max(n, m);

        Random rand = new Random();

        for (int i = 0; i <= max - min ; i++) {
            int randNumber = min + rand.nextInt((max - min) + 1);
            System.out.print(randNumber + " ");
        }
    }
}
