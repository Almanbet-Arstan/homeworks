package com.company;

public class Businessman extends AbstractEmployee implements Comparable{
    public Businessman(String name, int age, int salary, int experienceOfWork) {
        super(name, age, salary, experienceOfWork);
    }

    @Override
    public int compareTo(Object o) {
        Businessman businessman = (Businessman) o;
        if (getSalary() < businessman.getSalary()){
            return 1;
        }else if (getSalary() == businessman.getSalary()){
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "\nBusinessman " + super.toString();
    }
}
