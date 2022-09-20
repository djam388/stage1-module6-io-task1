package com.epam.mjc.io;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader();
        fileReader.getDataFromFile(new File("./" + "/src/main/resources/Profile.txt"));
    }
}
