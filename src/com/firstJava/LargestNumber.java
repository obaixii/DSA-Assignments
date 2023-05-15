package com.firstJava;

import java.util.Scanner;

// Take 2 numbers as input and print the largest number.
public class LargestNumber {
    public static void main(String[] args) {
        System.out.println(" Largest Number Program");
        int number1 , number2 ;

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter first Number :: ");
        number1 = input.nextInt();

        System.out.print("Please Enter first Number :: ");
        number2 = input.nextInt();

        if (number1>number2){
            System.out.print(String.format("%d is the largest Number",number1));
        }else{
            System.out.print(String.format("%d is the largest Number",number2));
        }
    }
}
