package com.company.LambdaIntroduction.Homework.A;

import java.util.List;

public abstract class LiquidAbstract {
    private String name;

    public LiquidAbstract(String name) {
        this.name = name;
    }

    public void pour(List<? extends LiquidAbstract> liquids) {
        for (LiquidAbstract liquid:liquids) {
            System.out.println("Pouring the " + liquid.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
