package com.company.Lesson;

public class Cat {
    private int age;
    private String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public int hashCode(){
        return this.age + name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() != obj.hashCode()){
            return false;
        }
        return this.hashCode() == obj.hashCode();
    }
}
