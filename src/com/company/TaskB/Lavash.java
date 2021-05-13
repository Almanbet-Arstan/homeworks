package com.company.TaskB;

public class Lavash extends Bread{


    void wrapItUp(){
        System.out.println("Wrap the lavash");
    }
    @Override
    void bake() {
        System.out.println("Bake Lavash");
        System.out.println("I am lavash, I was baked");
    }
}
