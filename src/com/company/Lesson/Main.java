package com.company.Lesson;

public class Main {
    public static void main(String[] args) {
//        WeekDays[] weekend = new WeekDays[]{WeekDays.SATURDAY, WeekDays.SUNDAY};

        WeekDays[] weekend = WeekDays.values();
        for (WeekDays weekDay : weekend) {
            System.out.println(weekDay);
            System.out.println(weekDay.ordinal());
        }


//        defineDay(WeekDays.FRIDAY);
//        defineDay(WeekDays.MONDAY);
//        defineDay(WeekDays.SUNDAY);

//        Computer asus = new Computer(Model.ASUS);
//        Computer dell = new Computer(Model.DELL);
//
//
//        Model model = Model.ASUS;
//        String asusName = Model.ASUS.name();
//        Model modelAsus = Model.valueOf("ASUS");
//
//        System.out.println(asusName);
//        System.out.println(model == Model.ASUS);
//        System.out.println(model == Model.DELL);
//        System.out.println(asus);
//        System.out.println(dell);
//        System.out.println(modelAsus);
    }

    public static void defineDay(WeekDays weekDay) {
        switch (weekDay){
            case MONDAY -> System.out.println("work!");
            case TUESDAY -> System.out.println("work!");
            case WEDNESDAY -> System.out.println("work!");
            case THURSDAY -> System.out.println("work!");
            case FRIDAY -> System.out.println("work!");
            case SATURDAY -> System.out.println("relax!");
            case SUNDAY -> System.out.println("relax!");
        }
    }
}
