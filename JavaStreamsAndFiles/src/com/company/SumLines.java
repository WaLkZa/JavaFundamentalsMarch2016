package com.company;

import java.io.*;
import java.util.ArrayList;

public class SumLines {

    public static void main(String[] args) {
        ArrayList<Integer> outputResult = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(new File("lines.txt")))) {
            String inputLine;

            while((inputLine = reader.readLine()) != null){
                int sum = 0;

                for (int i = 0; i < inputLine.length(); i++) {
                    sum += inputLine.charAt(i);
                }

                outputResult.add(sum);
            }

            for (int i = 0; i < outputResult.size(); i++) {
                System.out.println(outputResult.get(i));
            }
        } catch(IOException ex){
            System.out.println(ex.toString());
        }
    }
}
