package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        amount = amount * percent * 0.01 + amount;
        if (amount < salary) {
            return 1;
        }
        while (amount > salary) {
            amount = (amount + amount * percent * 0.01) - salary;
            year++;
        }
        return year;
    }

}
