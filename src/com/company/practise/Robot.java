package com.company.practise;

public class Robot {
    String name;
    String message;
    double version;

    public void talk() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("I'm " + name + ", " + message);
        }

    }
}
