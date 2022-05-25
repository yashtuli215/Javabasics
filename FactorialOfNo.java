package com.yash;
import java.util.Scanner;
//Factorial of a given no
public class FactorialOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int factorial =1;
        for (int i =1;i<=n;i++){
            factorial = factorial *i;
        }
        System.out.printf("Factorial of  %d is ",n);
        System.out.println(factorial);
    }
}
