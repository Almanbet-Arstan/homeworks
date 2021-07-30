package com.company.Homework;


public class Main {
    public static void main(String[] args) {
        UsersService userService = new UsersService();
//        UsersModels userModel = new UsersModels();
//        userModel.setPassword("12345");
//        userModel.setLogin("login");
//        userModel.setEmail("login@mail.ru");
//        userModel.setBlocked(false);
//        UsersModels userModel2 = new UsersModels();
//        userModel2.setPassword("password");
//        userModel2.setLogin("login2");
//        userModel2.setEmail("login2@mail.ru");
//        userModel2.setBlocked(false);
//        try {
//            userService.register(userModel);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            userService.register(userModel2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        userService.authorize("login", "12345");
        userService.authorize("login2", "password");
        userService.unblock("login2", "password");
        userService.unblock("login", "12345");

    }
}
