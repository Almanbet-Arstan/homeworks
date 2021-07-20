package com.company.Lesson;

import com.company.Lesson.dao.StudentsDao;
import com.company.Lesson.dao.impl.StudentsDaoImpl;
import com.company.Lesson.model.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        StudentsDao studentsDao = new StudentsDaoImpl();
//        System.out.println("Count of students full_name '%a%' = " + studentsDao.countStudents());
        StudentsDao studentsDao = new StudentsDaoImpl();
        List<Student> students = studentsDao.getAll();
        for (Student student:students) {
            System.out.println(student);
        }
    }
}
