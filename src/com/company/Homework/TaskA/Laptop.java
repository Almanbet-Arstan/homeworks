package com.company.Homework.TaskA;

public class Laptop {
    private int price;
    private Models model;
    private boolean sales;

    public Laptop(int price, Models model, boolean sales) {
        this.price = price;
        this.model = model;
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

    public boolean isSales() {
        return sales;
    }

    public void setSales(boolean sales) {
        this.sales = sales;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof Laptop){
            return (((Laptop) obj).model == Models.valueOf("LENOVO") || ((Laptop) obj).model == Models.valueOf("DELL") && ((Laptop) obj).price == (this.price));
        }
        return false;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", sales=" + sales +
                '}';
    }
}
