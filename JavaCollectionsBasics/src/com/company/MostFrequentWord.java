package com.company;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "[\\p{Punct}\\s]+";
        String[] inputText = scanner.nextLine().toLowerCase().split(pattern);

        int wordCounter = 0;

        TreeMap<String, Integer> words = new TreeMap<>();

        for (int i = 0; i < inputText.length; i++) {
            for (int j = 0; j <inputText.length; j++) {
                if (inputText[i].equals(inputText[j])) {
                    wordCounter++;
                }
            }

            words.put(inputText[i], wordCounter);

            wordCounter = 0;
        }

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() > wordCounter) {
                wordCounter = entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() == wordCounter) {
                System.out.printf("%s -> %d time%s\n",
                        entry.getKey(), entry.getValue(), entry.getValue() > 1 ? "s" : "");
            }
        }
    }
}