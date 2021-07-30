package com.company.Lesson;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
//        UserModel userModel = new UserModel();
//        userModel.setPassword("1270957346");
//        userModel.setLogin("login9");
//        userModel.setEmail("login9@mail.ru");
//        UserModel userModel2 = new UserModel();
//        userModel2.setPassword("096336425246");
//        userModel2.setLogin("login10");
//        userModel2.setEmail("login10@mail.ru");
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

        userService.authorize("login", "123");
        userService.authorize("login2", "123");

    }
}
