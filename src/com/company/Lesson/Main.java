package com.company.Lesson;

import java.util.ArrayList;

public class Main {
    static ArrayList<Multiple> multiples = new ArrayList<>();
    public static void main(String[] args) {
        addToArray(new Multiple(20, 5));
        addToArray(new Multiple(15, 1));
        addToArray(new Multiple(10, 10));
        addToArray(new Multiple(3, 5));
        for (Multiple item:multiples) {
            System.out.println(item);
        }
    }
    public static boolean addToArray (Multiple multiple) {
        for (Multiple item : multiples) {
            if (item.equals(multiple)){
                return false;
            }
        }

        multiples.add(multiple);
        return true;
    }
}
