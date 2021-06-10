package com.company.Lesson29;

import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        npe();
        iobeex();
        fnfe();
        throwNpe();
        throwErrorIfNotSquare(4);
    }
    public static void throwErrorIfNotSquare(int square){
        try {
            if (Math.pow(Math.sqrt(square), 2) != square)
                throw new Error("Не квадрат");
            else
                System.out.println("Квадрат");
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }

    public static void throwNpe() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("ha ha ha");
    }

    public static void npe(){
        try {
            String str = null;
            str.length();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void iobeex() {
        try {
            int [] arr = new int[2];
            System.out.println(arr[3]);
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void fnfe() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("Test.txt");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception);
        }
    }
}
