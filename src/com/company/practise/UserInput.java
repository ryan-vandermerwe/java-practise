package com.company.practise;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");

        String yourName = input.nextLine();

        System.out.println("your name is: " + yourName);

        System.out.println();

        System.out.println("Enter surname: ");

        String yourSurname = input.nextLine();

        System.out.println("your Surname is: " + yourSurname);
        System.out.println();

        System.out.println("You are: " + yourName + " " + yourSurname);

        System.out.println("program finished");
    }


}
