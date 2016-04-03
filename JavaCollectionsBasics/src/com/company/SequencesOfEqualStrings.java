package com.company;


import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputText = scanner.nextLine().split(" ");

        System.out.print(inputText[0]);

        for (int i = 1; i < inputText.length; i++) {
            if (inputText[i - 1].equals(inputText[i])){
                System.out.print(String.format(" %s", inputText[i]));
            } else {
                System.out.println();
                System.out.print(inputText[i]);
            }
        }

    }
}
