package com.company.Homework;

public class FirstThread extends Thread{
    private int num;

    public FirstThread(int num) {
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
        this.num = num * 2;
        System.out.println(this.num);
    }
}
