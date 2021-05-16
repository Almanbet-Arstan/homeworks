package com.company;

public class Client extends Person{
    private boolean constant;
    private int averageOrderReceipt;
    private boolean passedFaceControl;

    public Client(boolean constant, int averageOrderReceipt, boolean passedFaceControl, String name, int age, String address, String gender) {
        super(name, age, address, gender);
        this.constant = constant;
        this.averageOrderReceipt = averageOrderReceipt;
        this.passedFaceControl = passedFaceControl;
    }

    public Client() {
    }

    public boolean isConstant() {
        return constant;
    }

    public void setConstant(boolean constant) {
        this.constant = constant;
    }

    public int getAverageOrderReceipt() {
        return averageOrderReceipt;
    }

    public void setAverageOrderReceipt(int averageOrderReceipt) {
        this.averageOrderReceipt = averageOrderReceipt;
    }

    public boolean isPassedFaceControl() {
        return passedFaceControl;
    }

    public void setPassedFaceControl(boolean passedFaceControl) {
        this.passedFaceControl = passedFaceControl;
    }
    public void order(){
        System.out.println("Order");
    }
    public void pay(){
        System.out.println("Pay");
    }
    public void callTheWaiter(){
        System.out.println("Call the waiter");
    }


    @Override
    public String toString() {
        return "Client{" +
                "constant=" + constant +
                ", averageOrderReceipt=" + averageOrderReceipt +
                ", passedFaceControl=" + passedFaceControl +
                "} " + super.toString();
    }
}
