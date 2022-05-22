package com.bridgelabz.maximumproblem;

public class GenericClass<T extends Comparable<T>> {

    public void testMaximum(T... input) {

        Integer i=0;
        T max = input[i];
        for(T element: input){
            if (input[i].compareTo(max) > 0)
                max = input[i];
            i++;
        }
        System.out.println("The maximum Value is : "+max);
    }



}
