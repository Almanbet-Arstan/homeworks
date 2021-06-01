package com.company.Lesson;

public interface Swimable {
    boolean IS_SWIMMABLE = true;
    double MAX_OCEAN_DEPTH = 11022;
    default void swim() {
        System.out.println("Swimming ...");
    }
}
