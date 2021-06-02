package com.company.practise;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayListPractise {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<Integer>();
        grades.add(88);
        grades.add(50);
        grades.add(7);
        grades.add(0, 14); //add element and specify index of element (shifts previous element to next index)

        System.out.println(grades.size());

        System.out.println(grades.get(0));

        System.out.println(grades.indexOf(88)); // pass in value of element and get index

        System.out.println(grades.contains(88));

        if (!grades.isEmpty()) {
            System.out.println(grades.get(3));
        }
        grades.clear();


        List<Integer> numbers = Arrays.asList(58, 565, 5665, 44, 5); // Quickly Initialize a List with Elements: convert practise.Arrays to List
        System.out.println(Arrays.toString(numbers.toArray())); // Print List: convert list back to Array
        System.out.println("program finished");
    }
}

