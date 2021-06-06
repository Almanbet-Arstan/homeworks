package com.company.Homework.TaskA;

public class Main {
    public static void main(String[] args) {
        Swimmable[] swimmables = new Swimmable[8];
        Flyable[] flyables = new Flyable[8];
        Runable[] runables = new Runable[8];
        // Правильно ли я здесь сделал что указал размер массивам?
        Objects[] objects = new Objects[8];
        objects[0] = new Cat();
        objects[1] = new Duck();
        objects[2] = new Human();
        objects[3] = new Parrot();
        objects[4] = new Plane();
        objects[5] = new Shark();
        objects[6] = new Ship();
        objects[7] = new Whale();


        int countSwimmable = 0;
        int countRunable = 0;
        int countFlyable = 0;


        for (Objects object : objects) {
            if (object instanceof Swimmable){
                swimmables[countSwimmable] = (Swimmable) object;
                countSwimmable++;
            }
            if (object instanceof Runable){
                runables[countRunable] = (Runable) object;
                countRunable++;
            }
            if (object instanceof Flyable){
                flyables[countFlyable] = (Flyable) object;
                countFlyable++;
            }
        }
        swimmablesSwims(swimmables);
        runableRun(runables);
        flyablesFly(flyables);
    }
    public static void swimmablesSwims(Swimmable[] swimmables){
        for (Swimmable swimmable : swimmables) {
            if (swimmable != null){
                swimmable.swim();
            }
        }
    }
    public static void flyablesFly(Flyable[] flyables){
        for (Flyable flyable : flyables) {
            if (flyable != null){
                flyable.fly();
            }
        }
    }
    public static void runableRun(Runable[] runables){
        for (Runable runable : runables) {
            if (runable != null){
                runable.run();
            }
        }
    }
}
