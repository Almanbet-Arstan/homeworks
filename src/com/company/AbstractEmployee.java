package com.company;

public abstract class AbstractEmployee {
    private String name;
    private int age;
    private int Salary;
    private int experienceOfWork;

    public AbstractEmployee(String name, int age, int salary, int experienceOfWork) {
        this.name = name;
        this.age = age;
        Salary = salary;
        this.experienceOfWork = experienceOfWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getExperienceOfWork() {
        return experienceOfWork;
    }

    public void setExperienceOfWork(int experienceOfWork) {
        this.experienceOfWork = experienceOfWork;
    }

    @Override
    public String toString() {
        return "Employee " +
                "\nname = " + name +
                "\nage = " + age +
                "\nSalary = " + Salary +
                "\nexperienceOfWork = " + experienceOfWork;
    }
}
