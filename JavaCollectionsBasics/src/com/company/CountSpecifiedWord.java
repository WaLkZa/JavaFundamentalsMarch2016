package com.company;


import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "[\\p{Punct}\\s]+";
        String[] inputText = scanner.nextLine().toLowerCase().split(pattern);

        String inputWord = scanner.next();

        int wordCounter = 0;

        for (int i = 0; i < inputText.length; i++) {
            if (inputWord.equals(inputText[i])) {
                wordCounter++;
            }
        }
        System.out.println(wordCounter);
    }
}
