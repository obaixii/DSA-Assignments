package com.firstJava;

import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Even or  Odd program");

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number :: ");

        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.print("The entered number is Even");
        }else{
            System.out.print("The entered number is Odd");
        }
    }
}
