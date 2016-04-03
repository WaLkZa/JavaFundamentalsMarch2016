package com.company;


import java.util.Scanner;

public class ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println(Integer.toString(num, 7));
    }
}
