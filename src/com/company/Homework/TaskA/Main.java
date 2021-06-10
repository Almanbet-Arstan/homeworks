package com.company.Homework.TaskA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/com/company/Homework/TaskA/song.txt");
        FileWriter fileWriter = new FileWriter("src/com/company/Homework/TaskA/Stereo Hearts.txt");
        Scanner sc = new Scanner(fileReader);
        int counter = 1;
        String name = null;
        String singer = null;
        String genre = null;
        String lyrics = "";
        while (sc.hasNextLine()){
            if (counter == 1){
                name = sc.nextLine() + '\n';
                fileWriter.write(name);
            }
            if (counter == 2){
                singer = sc.nextLine() + '\n';
                fileWriter.write(singer);
            }
            if (counter == 3){
                genre = sc.nextLine() + '\n';
                fileWriter.write(genre);
            }
            if (counter > 4){
                lyrics += sc.nextLine() + '\n';
            }
            counter++;
        }
        fileWriter.write(lyrics);
        Song song = new Song(name, singer, genre, lyrics);
        fileReader.close();
        fileWriter.close();
        System.out.println(song);
    }
}
