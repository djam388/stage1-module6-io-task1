package com.epam.mjc.io;

import java.io.File;


public class Main {
    public static void main(String[] args) {

        File fileToRead = new File("./" + "/src/main/resources/Profile.txt");

        FileReader fileReader = new FileReader();
        fileReader.getDataFromFile(fileToRead);
    }
}