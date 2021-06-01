package com.company.Lesson;

public class Container {
    private Swimable swimable;
    private Layable layable;

    public Container(Swimable swimable, Layable layable) {
        this.swimable = swimable;
        this.layable = layable;
    }
    public void transport(){
        System.out.println("Goodbye to NY");
    }
}
