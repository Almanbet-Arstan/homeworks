package com.company;

public class Security extends Employee{
    private boolean armed;
    private String typeOfWeapon;

    public Security(boolean armed, String typeOfWeapon, String position, int salary, int bonus, int fine, int lengthOfService, int numberOfDaysOfAdmission, String name, int age, String address, String gender) {
        super(position, salary, bonus, fine, lengthOfService, numberOfDaysOfAdmission, name, age, address, gender);
        this.armed = armed;
        this.typeOfWeapon = typeOfWeapon;
    }

    public Security() {
    }

    public boolean isArmed() {
        return armed;
    }

    public void setArmed(boolean armed) {
        this.armed = armed;
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }
    public void faceControl(){
        System.out.println("Face control");
    }
    public void expelPeople(){
        System.out.println("Expel people");
    }
    @Override
    public void beLate() {
        setFine(200);
    }

    @Override
    public String toString() {
        return "Security{" +
                "armed=" + armed +
                ", typeOfWeapon='" + typeOfWeapon + '\'' +
                "} " + super.toString();
    }
}
