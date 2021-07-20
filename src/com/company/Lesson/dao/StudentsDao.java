package com.company.Lesson.dao;

import com.company.Lesson.model.Student;

import java.util.List;

public interface StudentsDao {
    List<Student> getAll();
    boolean updateStudent(Student student);
    int countStudents();
}
