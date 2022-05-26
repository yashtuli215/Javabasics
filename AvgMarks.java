package com.yash;
//Program to Print and Calculate the average marks of Students in Physics.
public class AvgMarks {
    public static void main(String[] args) {
        int [] Physics = {30,50,60,90,100,80,80};
        float average =0;
        for(int element : Physics){
            average+=element;
        }
        System.out.println(average/Physics.length);
    }
}
