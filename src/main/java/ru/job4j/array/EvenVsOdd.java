package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                even += players[i];
            } else {
                odd += players[i];
            }
        }
        if (even > odd) {
            return 1;
        } else if (even < odd) {
            return 2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(whoWin(new int[]{5, 5, 5, 5}));
    }

}
