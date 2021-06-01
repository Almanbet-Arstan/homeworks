package com.company.Lesson;

public class Turtle implements TurtleBeable{
    @Override
    public void layEggs() {
        System.out.println("Turtle is laying eggs");
    }

    @Override
    public void wearAShell() {
        System.out.println("Turtle is wearing shell");
    }
}
