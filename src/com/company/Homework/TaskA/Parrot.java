package com.company.Homework.TaskA;

public class Parrot extends Objects implements Flyable, Runable {
    @Override
    public void fly() {
        System.out.println("Parrot flying");
    }

    @Override
    public void run() {
        System.out.println("Parrot runs");
    }
}
