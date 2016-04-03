package com.company;


import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();

        System.out.println(Integer.valueOf(num, 7));
    }
}
