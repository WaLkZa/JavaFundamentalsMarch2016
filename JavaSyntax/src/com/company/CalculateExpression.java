package com.company;


import java.util.Locale;
import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        Double[] threeNums = new Double[3];

        threeNums[0] = scanner.nextDouble();
        threeNums[1] = scanner.nextDouble();
        threeNums[2] = scanner.nextDouble();

        double resultByFirstFormula = calculateByFirstFormula(threeNums[0], threeNums[1], threeNums[2]);
        double resultBySecondFormula = calculateBySecondFormula(threeNums[0], threeNums[1], threeNums[2]);
        double numsAverage = calculateNumsAverage(threeNums[0], threeNums[1], threeNums[2]);
        double formulasAverage = (resultByFirstFormula + resultBySecondFormula) / 2;
        double difference = Math.abs(numsAverage - formulasAverage);

        System.out.printf(
                "F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f",
                resultByFirstFormula,
                resultBySecondFormula,
                difference);
    }


    private static double calculateByFirstFormula(double numA, double numB, double numC){
        double power = (numA + numB + numC) / Math.sqrt(numC);

        double result = Math.pow(
                (Math.pow(numA, 2) + Math.pow(numB, 2)) / (Math.pow(numA, 2) - Math.pow(numB, 2)),
                power);

        return result;
    }

    private static double calculateBySecondFormula(double numA, double numB, double numC){
        double result = Math.pow(Math.pow(numA, 2) + Math.pow(numB, 2) - Math.pow(numC, 3), (numA - numB));

        return result;
    }

    private static double calculateNumsAverage(double numA, double numB, double numC){
        double result = (numA + numB + numC) / 3;

        return result;
    }
}
