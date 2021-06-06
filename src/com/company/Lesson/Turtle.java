package com.company.Lesson;

public class Turtle implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Turtle is swimming");
    }

    @Override
    public void makeNoise() {
        System.out.println("pluh pluh");
    }
    public void layEggs(int eggsCount){
        System.out.println("Turtle lays eggs " + eggsCount);
    }
}
