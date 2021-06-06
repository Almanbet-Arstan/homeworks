package com.company.Lesson;

public class Duck implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void makeNoise() {
        System.out.println("Krya krya");
    }
}
