package com.company;

public class SecondThread implements Runnable{
    @Override
    public void run() {
        System.out.println("I'm second thread");
    }
}
