package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        FirstThread firstThread = new FirstThread();
//        Thread secondThread = new Thread(new SecondThread());
//        secondThread.start();
//        firstThread.start();
//        System.out.println("End of main");
//        Thread printThread = new Thread(new PrintThread("threadText", 10));
//        printThread.start();
//        printText("Hello world", 10);

//        List<String> firstStrings = Arrays.asList("Ivan", "Max", "Andrew", "Shamil");
//        List<String> secondStrings = Arrays.asList("Chyngyz", "Alex", "Bermet", "Mirlan");
//        ThreadQueue firstQueue = new ThreadQueue(firstStrings);
//        firstQueue.setName("Аптека");
//        ThreadQueue secondQueue = new ThreadQueue(secondStrings);
//        secondQueue.setName("Магазин");
//
//        firstQueue.start();
//        secondQueue.start();
        MyClass myClass = new MyClass("Kan", "Nam");
        for (int i = 0; i < 10; i++) {
            Thread thread1 = new ThreadPrint(myClass);
            thread1.start();
            Thread thread2 = new ThreadPrint(myClass);
            thread2.start();
        }
    }
//    public static void printText(String text, int count){
//        for (int i = 0; i < count; i++) {
//            System.out.println(text);
//        }
//    }
}
