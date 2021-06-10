package com.company.Lesson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("file1.txt");
        Scanner sc = new Scanner(fileReader);
        int i = 1;
        while (sc.hasNextLine()){
            System.out.println(i + " - " + sc.nextLine());
            i++;
        }
        fileReader.close();
    }
}
