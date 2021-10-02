package com.company.Lesson;

public class Student {
    private Long mark;
    private String fullName;


    public Student() {
    }

    public Student(Long mark, String fullName) {
        this.mark = mark;
        this.fullName = fullName;
    }

    public Long getMark() {
        return mark;
    }

    public void setMark(Long mark) {
        this.mark = mark;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
