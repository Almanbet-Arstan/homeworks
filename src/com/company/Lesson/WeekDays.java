package com.company.Lesson;

public enum WeekDays {
    MONDAY(1, "Пн"),
    TUESDAY(2, "Вт"),
    WEDNESDAY(3, "Ср"),
    THURSDAY (4, "Чт"),
    FRIDAY(5, "Пт"),
    SATURDAY(6, "Сб"),
    SUNDAY(7, "Вс");

    private int code;
    private String ru;

    WeekDays(int code, String ru) {
        this.code = code;
        this.ru = ru;
    }
    public int getCode() {
        return this.code;
    }
    public String getRu() {
        return this.ru;
    }
}
