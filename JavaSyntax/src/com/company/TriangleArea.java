package com.company;


import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pointA = scanner.nextLine().split(" ");
        String[] pointB = scanner.nextLine().split(" ");
        String[] pointC = scanner.nextLine().split(" ");

        int aX = Integer.parseInt(pointA[0]);
        int aY = Integer.parseInt(pointA[1]);
        int bX = Integer.parseInt(pointB[0]);
        int bY = Integer.parseInt(pointB[1]);
        int cX = Integer.parseInt(pointC[0]);
        int cY = Integer.parseInt(pointC[1]);

        int area = ((aX * (bY - cY)) + (bX * (cY - aY)) + (cX * (aY - bY))) / 2;

        System.out.printf("%d", Math.abs(area));
    }
}
