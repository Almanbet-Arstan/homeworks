package com.company.homework14;

public class Almanbet_Arstan {
    public static void main(String[] args) {
//        Задание А
//        Student student1 = new Student();
//        student1.GPA = 3.8f;
//        student1.age = 18;
//        student1.name = "Азирет";
//        student1.inWhichCityLive = "Бишкек";
//        student1.isContractPaid = "на половину";
//        System.out.printf("Меня зовут %s, мне %d лет, живу в городе %s, средний балл у меня %.1f, контракт оплачен %s. \n", student1.name, student1.age, student1.inWhichCityLive, student1.GPA, student1.isContractPaid);
//        Student student2 = new Student();
//        student2.GPA = 2.3f;
//        student2.age = 17;
//        student2.name = "Мухаммед";
//        student2.inWhichCityLive = "Баткен";
//        student2.isContractPaid = "на половину";
//        System.out.printf("Меня зовут %s, мне %d лет, живу в городе %s, средний балл у меня %.1f, контракт оплачен %s. \n", student2.name, student2.age, student2.inWhichCityLive, student2.GPA, student2.isContractPaid);
//        Student student3 = new Student();
//        student3.GPA = 2.5f;
//        student3.age = 18;
//        student3.name = "Атай";
//        student3.inWhichCityLive = "Ош";
//        student3.isContractPaid = "полностью";
//        System.out.printf("Меня зовут %s, мне %d лет, живу в городе %s, средний балл у меня %.1f, контракт оплачен %s. \n", student3.name, student3.age, student3.inWhichCityLive, student3.GPA, student3.isContractPaid);

//        Задание В
//        Dota2Heroes hero1 = new Dota2Heroes();
//        hero1.isMeleeTypeOfAttack = true;
//        hero1.mainCharacteristic = "strength";
//        hero1.numberOfAbilities = 4;
//        hero1.nameOfHero = "Pudge";
//        if (hero1.isMeleeTypeOfAttack){
//            System.out.printf("My name is %s, and I love meat. Also I am a melee %s hero with %d ability. \n", hero1.nameOfHero, hero1.mainCharacteristic, hero1.numberOfAbilities);
//        }else {
//            System.out.printf("My name is %s, and I love meat. Also I am a ranged %s hero with %d ability. \n", hero1.nameOfHero, hero1.mainCharacteristic, hero1.numberOfAbilities);
//        }
//        Dota2Heroes hero2 = new Dota2Heroes();
//        hero2.isMeleeTypeOfAttack = true;
//        hero2.mainCharacteristic = "agility";
//        hero2.numberOfAbilities = 4;
//        hero2.nameOfHero = "Riki";
//        if (hero2.isMeleeTypeOfAttack){
//            System.out.printf("My name is %s, and I attack as silently as smoke. Also I am a melee %s hero with %d ability. \n", hero2.nameOfHero, hero2.mainCharacteristic, hero2.numberOfAbilities);
//        }else {
//            System.out.printf("My name is %s, and I attack as silently as smoke. Also I am a ranged %s hero with %d ability. \n", hero2.nameOfHero, hero2.mainCharacteristic, hero2.numberOfAbilities);
//        }
//        Dota2Heroes hero3 = new Dota2Heroes();
//        hero3.isMeleeTypeOfAttack = false;
//        hero3.mainCharacteristic = "intelligence";
//        hero3.numberOfAbilities = 14;
//        hero3.nameOfHero = "Invoker";
//        if (hero3.isMeleeTypeOfAttack){
//            System.out.printf("My name is %s, and the spheres light my way. Also I am a melee %s hero with %d ability. \n", hero3.nameOfHero, hero3.mainCharacteristic, hero3.numberOfAbilities);
//        }else {
//            System.out.printf("My name is %s, and the spheres light my way. Also I am a ranged %s hero with %d ability. \n", hero3.nameOfHero, hero3.mainCharacteristic, hero3.numberOfAbilities);
//        }
    /*
    * 1. Что такое парадигма ООП?
    * Делим задачу на объекты
    * 2. Что такое классы в Java?
    * Это шаблон, по которому делается объект
    * 3. Что такое свойства класса?
    * Свойство это характеристика объекта или его отличительная черта
    * 4. Как создать экземпляр класса (объект)?
    * Student student1 = new Student();
    * 5. Как создать свойства для определенного класса?
    * class Student {
        float GPA;
        int age;
        String name;
        String inWhichCityLive;
        String isContractPaid;
    }
    * 6. Как задать свойства?
    * student1.GPA = 3.8f;
        student1.age = 18;
        student1.name = "Азирет";
        student1.inWhichCityLive = "Бишкек";
        student1.isContractPaid = "на половину";
    * 7. Как получить определенное свойства объекта?
    * System.out.printf("Меня зовут %s, мне %d лет, живу в городе %s, средний балл у меня %.1f, контракт оплачен %s. \n", student1.name, student1.age, student1.inWhichCityLive, student1.GPA, student1.isContractPaid);
    * System.out.println("Меня зовут " + student1.name);
    * */
    }
}

class Student {
    float GPA;
    int age;
    String name;
    String inWhichCityLive;
    String isContractPaid;
}

class Dota2Heroes {
    boolean isMeleeTypeOfAttack;
    String mainCharacteristic;
    int numberOfAbilities;
    String nameOfHero;
}