package com.company.Homework.TaskA;

public class Human extends Objects implements Swimmable, Runable {
    @Override
    public void run() {
        System.out.println("Human runs");
    }

    @Override
    public void swim() {
        System.out.println("Human swims");
    }
}
