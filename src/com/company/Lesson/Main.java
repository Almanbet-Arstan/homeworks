package com.company.Lesson;

public class Main {
    public static void main(String[] args) {
        Swimmable swimmableShark = new Shark();
        Swimmable swimmableTurtle = new Turtle();

        Swimmable[] swimmables = new Swimmable[9];

        Turtle[] turtles = new Turtle[3];
        Shark[] sharks = new Shark[3];
        Duck[] ducks = new Duck[3];

        swimmables[0] = new Turtle();
        swimmables[1] = new Turtle();
        swimmables[2] = new Turtle();
        swimmables[3] = new Shark();
        swimmables[4] = new Shark();
        swimmables[5] = new Shark();
        swimmables[6] = new Duck();
        swimmables[7] = new Duck();
        swimmables[8] = new Duck();

        int countTurtles = 0;
        int countSharks = 0;
        int countDucks = 0;

        for (Swimmable swimmable : swimmables){
            if (swimmable instanceof Turtle){
                turtles[countTurtles] = (Turtle) swimmable;
                countTurtles++;
            }
            if (swimmable instanceof Shark){
                sharks[countSharks] = (Shark) swimmable;
                countSharks++;
            }
            if (swimmable instanceof Duck){
                ducks[countDucks] = (Duck) swimmable;
                countDucks++;
            }
        }
    }
}
