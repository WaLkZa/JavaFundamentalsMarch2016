package com.company;


import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "[\\p{Punct}\\s]+";
        String[] inputText = scanner.nextLine().toLowerCase().split(pattern);

        int wordCounter = 0;

        for (int i = 0; i < inputText.length; i++) {
            wordCounter++;
        }

        System.out.println(wordCounter);
    }
}
