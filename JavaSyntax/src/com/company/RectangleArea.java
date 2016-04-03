package com.company;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int rectangleArea = sideA * sideB;

        System.out.println(rectangleArea);
    }
}
