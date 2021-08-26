package com.company.Lesson;

public class Person {
    private String fullName;

    @Override
    public int hashCode() {
        return 1;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (obj == this) {
//            return true;
//        }
//
//        return this.fullName.equals(((Person)obj).getFullName());
//    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
