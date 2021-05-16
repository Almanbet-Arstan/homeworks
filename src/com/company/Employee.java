package com.company;

public class Employee extends Person{
    private String Position;
    private int Salary;
    private int Bonus;
    private int Fine;
    private int lengthOfService;
    private int numberOfDaysOfAdmission;

    public Employee(String position, int salary, int bonus, int fine, int lengthOfService, int numberOfDaysOfAdmission, String name, int age, String address, String gender) {
        super(name, age, address, gender);
        this.Position = position;
        this.Salary = salary;
        this.Bonus = bonus;
        this.Fine = fine;
        this.lengthOfService = lengthOfService;
        this.numberOfDaysOfAdmission = numberOfDaysOfAdmission;
    }
    public Employee(){

    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int bonus) {
        Bonus = bonus;
    }

    public int getFine() {
        return Fine;
    }

    public void setFine(int fine) {
        Fine += fine;
    }

    public int getLengthOfService() {
        return lengthOfService;
    }

    public void setLengthOfService(int lengthOfService) {
        this.lengthOfService = lengthOfService;
    }

    public int getNumberOfDaysOfAdmission() {
        return numberOfDaysOfAdmission;
    }

    public void setNumberOfDaysOfAdmission(int numberOfDaysOfAdmission) {
        this.numberOfDaysOfAdmission = numberOfDaysOfAdmission;
    }
    public void leaveWork(){
        System.out.println("Leave work");
    }
    public void goOnVacation(){
        System.out.println("Go On Vacation");
    }
    public void beLate(){
        System.out.println("Be Late");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Position='" + Position + '\'' +
                ", Salary=" + Salary +
                ", Bonus=" + Bonus +
                ", Fine=" + Fine +
                ", lengthOfService=" + lengthOfService +
                ", numberOfDaysOfAdmission=" + numberOfDaysOfAdmission +
                "} " + super.toString();
    }
}
