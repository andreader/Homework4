package ru.skypro;

public class Main {

    public static void main(String[] args) {
        for (int cometYear = 1896, currentYear = 2022, hundredYearsAfter = 2122, cometPeriod = 79; cometYear < hundredYearsAfter; cometYear = cometYear + cometPeriod) {
            System.out.println(cometYear);
        }
}}
