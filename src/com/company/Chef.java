package com.company;

public class Chef extends Employee{
    private String whatDishesCook;
    private String specialty;
    private int certificates;

    public Chef(String whatDishesCook, String specialty, int certificates, String position, int salary, int bonus, int fine, int lengthOfService, int numberOfDaysOfAdmission, String name, int age, String address, String gender) {
        super(position, salary, bonus, fine, lengthOfService, numberOfDaysOfAdmission, name, age, address, gender);
        this.whatDishesCook = whatDishesCook;
        this.specialty = specialty;
        this.certificates = certificates;
    }

    public Chef() {
    }

    public String getWhatDishesCook() {
        return whatDishesCook;
    }

    public void setWhatDishesCook(String whatDishesCook) {
        this.whatDishesCook = whatDishesCook;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCertificates() {
        return certificates;
    }

    public void setCertificates(int certificates) {
        this.certificates = certificates;
    }
    public void goGroceryShopping(){
        System.out.println("Go grocery shopping");
    }
    public void inventDishes(){
        System.out.println("Invent dishes");
    }
    public void cookDish(){
        System.out.println("Cook dish");
    }

    @Override
    public void beLate() {
        setFine(500);
    }

    @Override
    public String toString() {
        return "Chef{" +
                "whatDishesCook='" + whatDishesCook + '\'' +
                ", specialty='" + specialty + '\'' +
                ", certificates=" + certificates +
                "} " + super.toString();
    }
}
