package com.company.Homework;


public class Main {
    private static int num = 10;
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread(num);
        firstThread.start();
        SecondThread secondThread = new SecondThread(num);
        secondThread.start();
        Thread thirdThread = new Thread(new ThirdThread(num));
        thirdThread.start();
        Thread fourthThread = new Thread(new FourthThread(num));
        fourthThread.start();
    }
}
