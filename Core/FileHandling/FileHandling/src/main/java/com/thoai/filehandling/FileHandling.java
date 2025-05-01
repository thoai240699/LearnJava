/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.thoai.filehandling;

import java.io.*;

/**
 *
 * @author QA19
 */
public class FileHandling {

    public static void main(String[] args) {
        String text = "Hello World";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("myFile.txt", true))) {
            writer.write(text);
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String line;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("myFile.txt"));
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();//To read the next line

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 
// if you are using Java 7 or beyond, you can use what is
//known as a try-with-resources statement. This statement will
//automatically close the BufferedReader object for us so that we do not have
//to call the close() method explicitly
//        finally {
//            try {
//                if (reader != null) {
//                    reader.close(); // to release any system resource
//                }
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }
    File f =new File("myFile.txt");
    File nf =new File("myNewFile.txt");

    f.renameTo(nf);
    nf.delete();
}
}
