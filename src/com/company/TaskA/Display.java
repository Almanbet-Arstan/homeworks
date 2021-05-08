package com.company.TaskA;

public class Display {
    private int diagonal;
    private String manufacturer;
    private String matrixType;

    public Display(int diagonal, String manufacturer, String matrixType){
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
        this.matrixType = matrixType;
    }
    public Display () {
        diagonal = 15;
        manufacturer = "China";
        matrixType = "MVA";
    }

    @Override
    public String toString() {
        return "diagonal = " + diagonal +
                ", manufacturer = '" + manufacturer + '\'' +
                ", matrixType = '" + matrixType + '\'';
    }
}
