package com.company.Lesson;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("file1.txt");
        fileWriter.write("0\n");
        fileWriter.write("1\n");
        fileWriter.write("2\n");
        fileWriter.write("3\n");
        fileWriter.write("4\n");
        fileWriter.write("5\n");
        fileWriter.write("6\n");
        fileWriter.write("7\n");
        fileWriter.write("8\n");
        fileWriter.write("9\n");
        fileWriter.close();
    }
}
