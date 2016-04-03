package com.company;


import java.util.Scanner;
import java.util.TreeSet;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "[\\p{Punct}\\s]+";
        String[] inputText = scanner.nextLine().toLowerCase().split(pattern);

        TreeSet<String> uniqueWords = new TreeSet<>();

        for (String word : inputText) {
            uniqueWords.add(word);
        }

        for (String word : uniqueWords) {
            System.out.printf("%s ", word);
        }
    }
}