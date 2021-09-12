package com.company.Homework;

public class SecondThread extends Thread{
    private int num;

    public SecondThread(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        this.num = num / 2;
        System.out.println(this.num);
    }
}
