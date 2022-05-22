package com.bridgelabz.maximumproblem;

import java.util.Scanner;

public class MaximumProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Maximum Problem");

//        System.out.println("Enter 1st value:");
//        Double val1 = sc.nextDouble();
//        System.out.println("Enter 2nd value:");
//        Double val2 = sc.nextDouble();
//        System.out.println("Enter 3rd value:");
//        Double val3 = sc.nextDouble();

        GenericClass genericClass = new GenericClass();

        System.out.println("The largest value is :"+genericClass.findMax(2,9,4));
        System.out.println("The largest value is :"+genericClass.findMax(0.84f,3.78f,9.83f));

    }
}
