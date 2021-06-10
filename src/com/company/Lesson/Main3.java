package com.company.Lesson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("file1.txt");
        FileWriter fileWriter = new FileWriter("file2.txt");
        Scanner sc = new Scanner(fileReader);
        int counter = 1;
        String currentLine = null;
        while (sc.hasNextLine()){
            currentLine = sc.nextLine();
            if (counter % 3 == 0){
                fileWriter.write(currentLine);
                System.out.print(currentLine);
            }
            counter++;
        }
        fileReader.close();
        fileWriter.close();
    }
}
