package com.company.TaskA;

public class Cow {
    private int weight;
    private int age;
    private String gender;
    private String nickname;

    public Cow(int weight, int age, String gender, String nickname) {
        this.weight = weight;
        if (age > 0) this.age = age;
        else System.out.println("Error");
        this.gender = gender;
        this.nickname = nickname;
    }

    public Cow() {
        weight = 400;
        age = 18;
        gender = "Female";
        nickname = "Burenka";
    }



    @Override
    public String toString() {
        return "Cow{" +
                "weight = " + weight +
                ", age = " + age +
                ", gender = '" + gender + '\'' +
                ", nickname = '" + nickname + '\'' +
                '}';
    }

}
