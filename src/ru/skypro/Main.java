package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int Friday = 1;
        int day = 1;
        for (; Friday < 31; Friday = Friday+7) {
            System.out.println("today is the " + Friday + "th of April 2022. It's Friday today. " + "Please, don't forget to prepare the report!");
        }
}}
