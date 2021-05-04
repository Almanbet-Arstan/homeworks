package com.company.TaskB;

public class Group {
    private Student[] students;
    private Course course;
    private int dateOfBegin;
    private int durationInMonths;

    public Student[] getStudents(){
        return students;
    }

    public void setStudents(Student[] students) {
        if (students == null) System.out.println("Error");
        else this.students = students;
    }
    public void printStudents(Student[] students){
        for (int i = 0; i < students.length; i++) {
            students[i].showInfo();
        }
    }
}
