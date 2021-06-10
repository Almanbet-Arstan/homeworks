package com.company;

public class Firefighter extends AbstractEmployee implements Comparable{
    public Firefighter(String name, int age, int salary, int experienceOfWork) {
        super(name, age, salary, experienceOfWork);
    }

    @Override
    public int compareTo(Object o) {
        Firefighter firefighter = (Firefighter) o;
        if (getExperienceOfWork() < firefighter.getExperienceOfWork()){
            return 1;
        }else if (getExperienceOfWork() == firefighter.getExperienceOfWork()){
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "\nFirefighter " + super.toString();
    }
}
