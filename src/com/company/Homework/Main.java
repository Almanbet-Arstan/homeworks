package com.company.Homework;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("D:\\Программирование\\Java\\homeworks\\src\\com\\company\\Homework\\Main.java")){
            // тут мы используем try with resources, создаем объект(для чтения) с внешним ресурсом
            Scanner sc = new Scanner(fileReader);
            // сканер считывает с fileReader
            FileWriter fileWriter = new FileWriter("Lesson30.txt");
            // создаем файл для записи в него
            String writeFile = "";
            // создали пустую строку
            while(sc.hasNextLine()){
                // проверяет есть ли следующая строка в fileReader
                writeFile += sc.nextLine() + "\n";
                //добавляем эту строку к пустой
            }
            fileWriter.write(writeFile);
            //в созданный файл Lesson30.txt мы копируем fileReader
            fileWriter.close();
            // закрываем поток
        } catch (FileNotFoundException fnfe) {
            System.out.println("Не нашли файл");
            // обрабатываем ошибку если вдруг она случится
        } catch (IOException inputOutError) {
            inputOutError.printStackTrace();
            // обрабатываем ошибку если вдруг она случится
        }
        File fileInformation = new File("Lesson30.txt");
        // создаем объект типа файл и указываем путь до файла
        if (fileInformation.length() > 100){
            // проверяем если размер больше 100 байт
            try{
                throw new IllegalStateException();
                // выкидываем exception
            }catch (IllegalStateException fileLarge){
                System.out.println("Код слишком большой");
                // обрабатываем его и выводим что код слишком большой
            }
        }
        try {
            FileReader readInString = new FileReader("Lesson30.txt");
            // создаем объект для чтения
            Scanner scanLine = new Scanner(readInString);
            // помещаем в сканер чтобы тот читал
            FileWriter lineText = new FileWriter("Lesson30withoutTabsAndEscapes.txt");
            // создаем файл для записи в него
            String line = "";
            // создали пустую строку для копирования
            String line2 = "";
            // создали пустую строку для того чтобы записать туда то что скопировали, но без табов и пробелов
            while (scanLine.hasNextLine()){
                // проверяет есть ли следующая строчка в файле
                line += scanLine.nextLine();
                // добавляем к пустой строке эту строку
            }
            if(line.contains(" ")){
                // тут проверяем есть ли у линии пробелы
                line2 = line.replace(" ", "");
                // здесь мы заменяем пробелы на пустоту
            }
            lineText.write(line2);
            // записываем в Lesson30withoutTabsAndEscapes файл то что было в Lesson30.txt, но без табов и пробелов
            lineText.close();
            // закрываем поток
            readInString.close();
            // закрываем поток

        } catch (FileNotFoundException fnfex) {
            System.out.println("Не найден файл для переноса кода в одну строку");
            // обрабатываем ошибку если вдруг она случится
        } catch (IOException e) {
            e.printStackTrace();
            // обрабатываем ошибку если вдруг она случится
        }
    }
}
