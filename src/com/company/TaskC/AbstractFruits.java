package com.company.TaskC;

public abstract class AbstractFruits {
    private final int id;
    private String variety;
    private static int countFruits;

    public AbstractFruits(String variety) {
        this.variety = variety;
        countFruits++;
        this.id = countFruits;
    }

    public AbstractFruits() {
        countFruits++;
        this.id = countFruits;
    }

    public int getId() {
        return id;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
