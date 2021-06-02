package com.company.practise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter array size: ");
        int size = userInput.nextInt();
        int[] grades = new int[size];
        System.out.println("number of elements in array: " + size);
        System.out.println("***********************************************");


        System.out.println("please enter elements in your array");


        for (int i = 0; i < size; i++) {
            int k = userInput.nextInt();
            grades[i] = k;

        }
        System.out.println("***********************************************");
        System.out.println("This is Your array: " + Arrays.toString(grades));
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));
        System.out.println("***********************************************");
        System.out.println("program finished");
    }

}





