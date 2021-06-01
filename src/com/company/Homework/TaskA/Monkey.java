package com.company.Homework.TaskA;

import com.company.Homework.TaskA.Climbable;

public class Monkey implements Climbable {
    private Climbable climbable;

    public void keepOnBack(Climbable climbable) {
        this.climbable = climbable;
    }

    @Override
    public void climb() {
        System.out.println("Monkey is climbing");
    }

}
