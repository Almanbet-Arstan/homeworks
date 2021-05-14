package com.company.TaskA.ITacademyW21;

import com.company.TaskA.Students.Group;
import com.company.TaskA.Students.Student;

public class Main {

    public static void main(String[] args) {
        Course course = new Course("Java", "16.02.2021", "20-001079", "Нурсултан");
        Student[] students = new Student[2];
        students[0] = new Student("16.08.03", "Тотоев", "Алманбет", "Мужчина", 17);
        students[1] = new Student("01.01.03", "Сериков", "Астан", "Мужчина", 18);
        Group group = new Group(students, "16.02.21", 10);

        Lessons lesson = new Lessons("13.05.21", students, course, group,"19:00", false, true);

        System.out.println(lesson);

//        Student student = new Student();
//        student.setAge(18);
//        student.setGender("Male");
//        student.setName("Aziret");
//        student.setSurname("Ramankulov");
//        student.setDateOfBirth(8);
//
//        Student student1 = new Student();
//        student1.setDateOfBirth(1);
//        student1.setSurname("Serikov");
//        student1.setName("Astan");
//        student1.setGender("Male");
//        student1.setAge(18);
//
//        Student[] students = new Student[2];
//        students[0] = student;
//        students[1] = student1;

//        Group group = new Group();
//        group.setStudents(students);
//        group.printStudents(group.getStudents());
    }
}
