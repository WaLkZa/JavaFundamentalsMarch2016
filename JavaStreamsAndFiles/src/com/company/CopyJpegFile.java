package com.company;


import java.io.*;

public class CopyJpegFile {
    public static void main(String[] args) {
        try(FileInputStream byteReader = new FileInputStream("softunilogo.jpg");
            FileOutputStream byteWriter = new FileOutputStream("my-copied-picture.jpg")
        ) {
            int byteContainer;
            while ((byteContainer = byteReader.read()) != -1) {
                byteWriter.write(byteContainer);
            }

        } catch(IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
