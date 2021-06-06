package com.company.Homework.TaskA;

public class Duck extends Objects implements Flyable, Runable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void run() {
        System.out.println("Duck runs");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }
}
