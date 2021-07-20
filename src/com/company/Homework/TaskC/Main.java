package com.company.Homework.TaskC;


import com.company.Homework.TaskC.dao.CityDao;
import com.company.Homework.TaskC.dao.CountryDao;
import com.company.Homework.TaskC.dao.PeopleDao;
import com.company.Homework.TaskC.dao.impl.CityDaoImpl;
import com.company.Homework.TaskC.dao.impl.CountryDaoImpl;
import com.company.Homework.TaskC.dao.impl.PeopleDaoImpl;
import com.company.Homework.TaskC.model.City;
import com.company.Homework.TaskC.model.Country;
import com.company.Homework.TaskC.model.People;

public class Main {
    public static void main(String[] args) {
        People people1 = new People("Human1", "2003-01-01");
        People people2 = new People("Human2", "2003-02-02");
        People people3 = new People("Human3", "2003-03-03");
        People people4 = new People("Human4", "2003-04-04");
        People people5 = new People("Human5", "2003-05-05");
        People people6 = new People("Human6", "2003-06-06");
        People people7 = new People("Human7", "2003-06-07");
        People people8 = new People("Human8", "2003-07-08");
        People people9 = new People("Human9", "2003-08-09");
        People people10 = new People("Human10", "2003-10-11");
        Country country1 = new Country("Kyrgyzstan", 312, 6500000, 2);
        Country country2 = new Country("Uzbekistan", 323, 60500000, 7);
        City city1 = new City("Bishkek", 1, 3, 1000000);
        City city2 = new City("Tashkent", 2, 1, 10000000);
        City city3 = new City("Tokmok", 1, 4, 1000);
        PeopleDao peopleDao = new PeopleDaoImpl();
        peopleDao.insert(people1);
        peopleDao.insert(people2);
        peopleDao.insert(people3);
        peopleDao.insert(people4);
        peopleDao.insert(people5);
        peopleDao.insert(people6);
        peopleDao.insert(people7);
        peopleDao.insert(people8);
        peopleDao.insert(people9);
        peopleDao.insert(people10);
        CountryDao countryDao = new CountryDaoImpl();
        countryDao.insert(country1);
        countryDao.insert(country2);
        CityDao cityDao = new CityDaoImpl();
        cityDao.insert(city1);
        cityDao.insert(city2);
        cityDao.insert(city3);
        System.out.println("Все страны которые начинаются на К");
        countryDao.selectCity();
        System.out.println("Общее кол-во человек во всех странах " + countryDao.getAllPeopleCount());
        System.out.println("Добавляем понятие Гос.Языка ");
        countryDao.addLanguageColumn();
    }
}
