package com.company;

import java.io.*;

public class AllCapitals {
    public static void main (String[] args){
        try(BufferedReader reader = new BufferedReader(new FileReader("lines.txt"));
                PrintWriter writer = new PrintWriter(new FileWriter("AllCapitalsOutput.txt"))
        ) {
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                writer.println(inputLine.toUpperCase());
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
