package com.company.TaskA;

import java.util.Arrays;

public class Lessons {
    String dateOfEvent;
    Student[] studentsPresent;
    Course course;
    Group group;
    String startTime;
    boolean hasHWBeenSet;
    boolean wasThereExam;

    public Lessons(String dateOfEvent, Student[] studentsPresent, Course course, Group group, String startTime, boolean hasHWBeenSet, boolean wasThereExam) {
        this.dateOfEvent = dateOfEvent;
        this.studentsPresent = studentsPresent;
        this.course = course;
        this.group = group;
        this.startTime = startTime;
        setHasHWBeenSet(hasHWBeenSet);
        setWasThereExam(wasThereExam);
    }

    public String getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(String dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public Student[] getStudentsPresent() {
        return studentsPresent;
    }

    public void setStudentsPresent(Student[] studentsPresent) {
        this.studentsPresent = studentsPresent;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String isHasHWBeenSet() {
        if (hasHWBeenSet == true) return "Да было";
        return "Нет не было";
    }

    public void setHasHWBeenSet(boolean hasHWBeenSet) {
        this.hasHWBeenSet = hasHWBeenSet;
    }

    public String isWasThereExam() {
        if (wasThereExam == true) return "Да был";
        return "Нет не был";
    }

    public void setWasThereExam(boolean wasThereExam) {
        this.wasThereExam = wasThereExam;
    }

    @Override
    public String toString() {
        return "Студенты присутствующие на уроке " + Arrays.toString(studentsPresent) +
                "\nКурс " + course +
                "\nГруппа" + group +
                "\nдата следующего проведения " + dateOfEvent +
                "\nвремя начала " + startTime +
                "\nБыло ли домашнее задание?\n" + isHasHWBeenSet() +
                "\nБыл ли экзамен?\n" + isWasThereExam();
    }
}
