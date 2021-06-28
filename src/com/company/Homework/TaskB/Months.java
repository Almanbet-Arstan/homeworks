package com.company.Homework.TaskB;

public enum Months {
    January(1),
    February(2),
    March(3),
    April(4),
    May(5),
    June(6),
    July(7),
    August(8),
    September(9),
    October(10),
    November(11),
    December(12);

    private int code;

    Months(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
