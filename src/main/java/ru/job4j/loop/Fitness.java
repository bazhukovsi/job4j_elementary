package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int count = 0;
        int ivanProtein = 3;
        int nikProtein = 2;
        while (ivan <= nik) {
            ivan = ivanProtein * ivan;
            nik = nikProtein * nik;
            count++;
        }
        return count;
    }
}
