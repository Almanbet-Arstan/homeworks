package com.company.Lesson;

public class Computer {
    private Model model;

    public Computer(Model model) {
        this.model = model;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model=" + model +
                '}';
    }
}
