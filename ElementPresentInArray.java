package com.yash;

import org.w3c.dom.ls.LSOutput;

public class ElementPresentInArray {
    public static void main(String[] args) {
        float marks[] = {45.7f, 67.8f, 99.7f, 63.4f, 98.4f};
        float num = 99.7f;
        boolean IsInArray = false;
        for (float element : marks) {
            if (num == element) {
                IsInArray = true;
                break;
            }
        }
        if (IsInArray) {
            System.out.println("The Value is Present in Array");
        } else {
            System.out.println("The Value is not Present in Array");
        }
    }
}



