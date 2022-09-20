package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {


    public Profile getDataFromFile(File file) {
        String name = "";
        String email = "";
        int age = 0;
        Long phone = 0L;
        System.out.println(file.toString());
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            String content = "";
            int ch;
            while ((ch = fileInputStream.read()) != -1) {
                content += (char)ch;
            }

            String[] contentLines = content.split("\\r?\\n|\\r");

                for (int i = 0; i < contentLines.length; i++) {
                String[] lineValues = contentLines[i].split(": ");
                if (lineValues.length > 1)  {
                    if (lineValues[0].equals("Name")) {
                        name = lineValues[1];
                    }
                    else if (lineValues[0].equals("Age")) {
                        age = Integer.valueOf(lineValues[1]);
                    }
                    else if (lineValues[0].equals("Email")) {
                        email = lineValues[1];
                    }
                    else if (lineValues[0].equals("Phone")) {
                        phone = Long.valueOf(lineValues[1]);
                    }
                }
            }
            return new Profile(name, age, email, phone);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch (IOException e) {
            System.out.println("Something went wrong!");
        }
        return null;
    }
}
