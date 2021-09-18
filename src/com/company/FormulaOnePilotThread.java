package com.company;

public class FormulaOnePilotThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Пилот " + Thread.currentThread().getName() + " занял " + Podium.place++ + " место");
    }
}
