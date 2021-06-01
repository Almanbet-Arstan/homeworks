package com.company.Lesson;

public class Main {
    public static void main(String[] args) {
        Hen hen = new Hen();
        Turtle turtle = new Turtle();
        Container toNY = new Container(turtle, hen);
        toNY.transport();
        System.out.println(Swimable.IS_SWIMMABLE);
        System.out.println(Swimable.MAX_OCEAN_DEPTH);
        System.out.println(Layable.IS_SWIMMABLE);
        System.out.println(Wearable.IS_SWIMMABLE);
    }
}
