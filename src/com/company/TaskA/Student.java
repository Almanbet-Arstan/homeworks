package com.company.TaskA;

public class Student {
    private String dateOfBirth;
    private String surname;
    private String name;
    private String gender;
    private int age;

    public Student(String dateOfBirth, String surname, String name, String gender, int age) {
        this.dateOfBirth = dateOfBirth;
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nСтудент " +
                "\nМеня зовут " + name +
                ", мне " + age + " лет" +
                ", фамилия " + surname +
                ", дата рождения " + dateOfBirth +
                ", пол " + gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAge(int age) {
        if (age <= 0) System.out.println("Error");
        else this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
//    public void showInfo(){
//        System.out.println(name);
//        System.out.println(surname);
//        System.out.println(age);
//        System.out.println(gender);
//        System.out.println(dateOfBirth);
//    }
}
