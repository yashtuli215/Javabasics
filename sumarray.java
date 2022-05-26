package com.yash;

import java.util.Scanner;

public class sumarray {
    public static void main(String[] args) {
         float sum =0;
        float  [] array  = {92.5f,94.5f,78.5f,78f,87.3f};
//        for (int i =0;i<array.length;i++){
//            sum+=array[i];
//        }
        //Using For each Loop
        for ( float element: array) {
            sum+=element;

        }

        System.out.println(sum);
    }

}
