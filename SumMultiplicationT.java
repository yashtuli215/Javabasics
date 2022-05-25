package com.yash;

import java.util.Scanner;

public class SumMultiplicationT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for (int i =1;i<=10;i++){
            sum =sum + (n*i);
        }
        System.out.println(sum);
    }
}
