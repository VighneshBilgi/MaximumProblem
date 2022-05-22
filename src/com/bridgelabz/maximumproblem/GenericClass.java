package com.bridgelabz.maximumproblem;

public class GenericClass<T extends Comparable<T>> {

    public void testMaximum(T... input) {

        T max = input[0];
        for(int i=0;i<input.length;i++){
            if (input[i].compareTo(max) > 0)
                max = input[i];

        }
        printMax(max);
    }

    public void printMax(T max) {

        System.out.println("The maximum Value is : "+max);
    }

}
