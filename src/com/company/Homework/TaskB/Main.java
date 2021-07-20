package com.company.Homework.TaskB;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentsDao studentsDao = new StudentsDaoImpl();
        System.out.println("В группе " + studentsDao.countStudents() + " студентов.");
        GroupDao groupDao = new GroupDaoImpl();
        List<Group> groups = groupDao.getAll();
        for (Group group:groups) {
            System.out.println(group);
        }
    }
}
