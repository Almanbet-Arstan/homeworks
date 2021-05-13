package com.company.TaskA;

public class Course {
    private String courseName;
    private String dateOfCreation;
    private String ID;
    private String nameOfTeacher;

    public Course(String courseName, String dateOfCreation, String ID, String nameOfTeacher) {
        this.courseName = courseName;
        this.dateOfCreation = dateOfCreation;
        this.ID = ID;
        this.nameOfTeacher = nameOfTeacher;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    @Override
    public String toString() {
        return "\nЭтот курс " + courseName +
                ", дата начала " + dateOfCreation +
                ", ID курса " + ID +
                ", имя учителя " + nameOfTeacher;
    }
}
