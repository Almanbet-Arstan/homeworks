package com.company;

public class Pensioner extends AbstractEmployee implements Comparable{
    public Pensioner(String name, int age, int salary, int experienceOfWork) {
        super(name, age, salary, experienceOfWork);
    }

    @Override
    public int compareTo(Object o) {
        Pensioner pensioner = (Pensioner) o;
        if (getAge() < pensioner.getAge()){
            return 1;
        }else if (getAge() == pensioner.getAge()){
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "\nPensioner " + super.toString();
    }
}
