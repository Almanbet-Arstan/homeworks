package com.company.Homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Generic<Integer, Integer> generic = new Generic<>(1, 1);
        Generic<Integer, String> generic2 = new Generic<>(1, "Second");
        System.out.println(generic.getInfoFirst() + "\n" +
                generic.getInfoSecond() + "\n" +
                generic.getFirst() + "\n" +
                generic.getSecond() + "\n" +
                generic.check());
        System.out.println(generic2.getInfoFirst() + "\n" +
                generic2.getInfoSecond() + "\n" +
                generic2.getFirst() + "\n" +
                generic2.getSecond() + "\n" +
                generic2.check());
    }
}
