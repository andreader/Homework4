package ru.skypro;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Cycle iteration " + i);
        }
        for (int i = 2020; i <= 2070; i = i + 4) {
            System.out.println("Leap year " + i);
        }
        int salary = 65535;
        int total = 0;
        int i = 0;
        for (; total <= 1_000_000; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println(total);
     //       System.out.println("Month " + i + ". Total " + total);
        }
    //      System.out.println("It will take " + i + " months!");
    }
}
