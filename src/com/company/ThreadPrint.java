package com.company;

public class ThreadPrint extends Thread{
    private MyClass myClass;

    public ThreadPrint(MyClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public void run() {
        myClass.ShowNames(Thread.currentThread().getName());
    }
}
