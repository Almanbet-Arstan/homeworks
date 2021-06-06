package com.company.Lesson;

public class Oceanarium {
    private final Duck[] ducks = new Duck[5];
    private final Shark[] sharks = new Shark[5];
    private final Turtle[] turtles = new Turtle[5];

    public Oceanarium() {
        for (int i = 0; i < 5; i++) {
            ducks[i] = new Duck();
            sharks[i] = new Shark();
            turtles[i] = new Turtle();
        }
    }

    public void listenToOceanarium(){
        listen(ducks);
        listen(sharks);
        listen(turtles);
    }
    public void listen(Swimmable[] swimmables){
        for (Swimmable swimmable : swimmables){
            if (swimmable != null){
                swimmable.makeNoise();
            }
        }
    }
}
