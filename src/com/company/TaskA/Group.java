package com.company.TaskA;

import java.util.Arrays;

public class Group {
    private Student[] students;
    private String dateOfBegin;
    private int durationInMonths;

//    public Student[] getStudents(){
//        return students;
//    }
//
//    public void setStudents(Student[] students) {
//        if (students == null) System.out.println("Error");
//        else this.students = students;
//    }
//    public void printStudents(Student[] students){
//        for (int i = 0; i < students.length; i++) {
//            students[i].showInfo();
//        }
//    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getDateOfBegin() {
        return dateOfBegin;
    }

    public void setDateOfBegin(String dateOfBegin) {
        this.dateOfBegin = dateOfBegin;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    public Group(Student[] students, String dateOfBegin, int durationInMonths) {
        this.students = students;
        this.dateOfBegin = dateOfBegin;
        this.durationInMonths = durationInMonths;
    }

    @Override
    public String toString() {
        return "\nЭта группа" +
                " в которой обучаются " + Arrays.toString(students) +
                "\nдата начала " + dateOfBegin +
                ", длительность в месяцах " + durationInMonths;
    }
}
