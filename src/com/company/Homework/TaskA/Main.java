package com.company.Homework.TaskA;

public class Main {
    public static void main(String[] args) {
        Monkey monkeyKid = new Monkey();
        Monkey monkey = new Monkey();
        monkey.keepOnBack(monkeyKid);
        monkey.climb();
        Banana banana = new Banana("Yellow", "Ecuador");
        banana.isEatable(true);
    }
}
