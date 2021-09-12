package com.company;

public class FirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("I'm first thread");
    }
}
