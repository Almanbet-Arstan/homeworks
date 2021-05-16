package com.company;

public class Waiter extends Employee{

    public Waiter(String position, int salary, int bonus, int fine, int lengthOfService, int numberOfDaysOfAdmission, String name, int age, String address, String gender) {
        super(position, salary, bonus, fine, lengthOfService, numberOfDaysOfAdmission, name, age, address, gender);
    }


    public void acceptOrder(){
        System.out.println("Accept order");
    }
    public void referOrder(){
        System.out.println("Refer order");
    }
    public void count(){
        System.out.println("Count");
    }
    @Override
    public void beLate() {
        setFine(100);
    }

    @Override
    public String toString() {
        return "Waiter{} " + super.toString();
    }
}
