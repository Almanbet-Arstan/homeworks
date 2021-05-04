package com.company.TaskA;

public class Cat {
    private String name;
    private int age;
    private String habitat;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if (age <= 0 || age > 14) System.out.println("Кот в лучшем мире");
        else this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getHabitat(){
        return habitat;
    }
    String ageInRussian(){
        if (age == 1 || age > 20 && age % 10 == 1) return "год";
        if (age < 5 || age > 20 && age % 10 < 5 && age % 10 != 1 && age % 10 != 0) return "года";
        return "лет";
    }
    void speak(){
        System.out.printf("Кота зовут %s, ему %d %s. %s место его проживания. \n", getName(), getAge(), ageInRussian(), getHabitat());
    }
}
