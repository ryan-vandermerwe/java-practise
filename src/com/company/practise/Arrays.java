package com.company.practise;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = 45;
        numbers[1] = 487;
        numbers[2] = 5456;
        /*
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        */
        for(int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Program finished");
    }

}
