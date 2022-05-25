package com.yash;

import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i =1;
        int factorial =1;
        while(i<=n){
            factorial = factorial*i;
            i++;
        }
        System.out.printf("Factorial of %d is ",n);
        System.out.println(factorial);

    }



}
