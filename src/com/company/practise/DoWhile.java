package com.company.practise;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        int value = 0;

        do{
            System.out.println("Enter number: ");
            value = userinput.nextInt();
        }
        while(value != 6);
        System.out.println("Bingo!");

        System.out.println("program finished");

    }
}
