package com.company.TaskB;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(18);
        student.setGender("Male");
        student.setName("Aziret");
        student.setSurname("Ramankulov");
        student.setDateOfBirth(8);

        Student student1 = new Student();
        student1.setDateOfBirth(1);
        student1.setSurname("Serikov");
        student1.setName("Astan");
        student1.setGender("Male");
        student1.setAge(18);

        Student[] students = new Student[2];
        students[0] = student;
        students[1] = student1;

        Group group = new Group();
        group.setStudents(students);
        group.printStudents(group.getStudents());
    }
}
