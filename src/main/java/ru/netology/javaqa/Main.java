package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        System.out.println("Day:" + post.birthday.day);
        System.out.println("Month:" + post.birthday.month);
        System.out.println("Year:" + post.birthday.year);
        System.out.println("Name:" + post.name);
        System.out.println("Passport:" + post.passport);
        System.out.println("Patronic:" + post.patronymic);
        System.out.println("Phone:" + post.phone);
        System.out.println("Surname:" + post.surname);
        System.out.println("Subscription:" + post.subscription);
        System.out.println("Birthday:" + post.birthday);
    }
}