package com.company.Homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла");
        String setNameFile = sc.nextLine();
        FileWriter newFile = new FileWriter(setNameFile);
        File file = new File(setNameFile);
        newFile.close();


        System.out.println("Был создайн файл: " + file.getName());
        String filePath = file.getName();
        int indexPoint = filePath.indexOf(".");
        String fileName = filePath.substring(0, indexPoint);
        int indexEnd = filePath.length();
        String fileExtantion = filePath.substring(indexPoint, indexEnd);
        System.out.println("Имя файла: " + fileName);
        System.out.println("Расширение файла: " + fileExtantion);
        System.out.println("Поменяйте расширение файла");
        fileExtantion = sc.nextLine();
        if (fileExtantion.contains(".")) {
            System.out.println("Расширение с точкой");
        } else {
            System.out.println("Добавляю точку так как вы забыли;)");
            fileExtantion = "." + fileExtantion;
        }
        filePath = fileName + fileExtantion;
        System.out.println("Вывод изменения имени с расширением в файл: " + file.getPath());
        file.renameTo(new File(filePath));
        System.out.println("Расширение файла изменено на: " + filePath);
    }
}
