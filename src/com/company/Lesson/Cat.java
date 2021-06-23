package com.company.Lesson;

public class Cat {
    private String name;
    private Integer age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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
    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (o instanceof Cat){
            return ((Cat)o).name.equals(this.name) && ((Cat)o).age == this.age;
        }
        return false;
    }
}
