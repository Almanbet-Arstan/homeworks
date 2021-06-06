package com.company.Lesson;

public class Shark implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Shark is swimming");
    }

    @Override
    public void makeNoise() {
        System.out.println("tyh tyh");
    }

    public void hunt(){
        System.out.println("Shark hunting");
    }
}
