package com.company.Homework.TaskA;

public class Computer {
    private int price;
    private Models model;
    private int monitorDiagonal;
    private boolean sales;

    public Computer(int price, Models model, int monitorDiagonal, boolean sales) {
        this.price = price;
        this.model = model;
        this.monitorDiagonal = monitorDiagonal;
        this.sales = sales;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Models getModel() {
        return model;
    }

    public int getMonitorDiagonal() {
        return monitorDiagonal;
    }

    public void setMonitorDiagonal(int monitorDiagonal) {
        this.monitorDiagonal = monitorDiagonal;
    }

    public boolean isSales() {
        return sales;
    }

    public void setSales(boolean sales) {
        this.sales = sales;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Computer){
            return (((Computer) obj).model == Models.valueOf("LG") || ((Computer) obj).model == Models.valueOf("MAC") && ((Computer) obj).price == (this.price) && ((Computer) obj).monitorDiagonal == (this.monitorDiagonal));
        }
        return false;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", monitorDiagonal=" + monitorDiagonal +
                ", sales=" + sales +
                '}';
    }
}
