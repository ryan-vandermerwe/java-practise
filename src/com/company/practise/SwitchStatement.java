package com.company.practise;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter command: ");

        String text = userInput.nextLine();

        switch (text){
            case "Start":
                System.out.println("You done started shit");
                break;
            case "Stop":
                System.out.println("You best stop yo' shit");
                break;

            default:
                System.out.println("Cracker ass cracker");


        }
        System.out.println("Program finished");
    }
}
