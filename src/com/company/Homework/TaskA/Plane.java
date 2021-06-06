package com.company.Homework.TaskA;

import com.company.Homework.TaskA.Flyable;
import com.company.Homework.TaskA.Objects;

public class Plane extends Objects implements Flyable {
    @Override
    public void fly() {
        System.out.println("Plane flying");
    }
}
