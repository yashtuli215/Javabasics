package com.yash;

import java.sql.SQLOutput;

public class firstnevennos {
    public static void main(String[] args) {
        int sum = 0;
        int n = 3;
        for (int i = 0; i < n; i++) {
            sum = sum + (2 * i);
        }
            System.out.println("Sum of first " + n + "  even numbers is : ");
            System.out.println(sum);

    }
}
