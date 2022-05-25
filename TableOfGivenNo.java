package com.yash;

import java.util.Scanner;

public class TableOfGivenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Result ;
        for(int i =1;i<=10;i++){
            Result = n *i;
            System.out.println(Result);

        }
    }
}
