package com.company.practise;

import java.util.Arrays;


public class TwoDeeArrays {
    public static void main(String[] args) {


        int[][] numbers = {
                {848, 4584, 8478, 848,},
                {12, 1555, 54, 477, 44554, 1},
                {1, 2, 3, 4, 5},

        };


        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers[i].length; k++) {
                System.out.print(numbers[i][k] + " ");
            }
            System.out.println();

        }
        System.out.println(numbers[2].length); //size of each row
        System.out.println(numbers.length); // size of multidimensional array
        System.out.println(Arrays.deepToString(numbers));


        System.out.println("program finished");
    }
}
