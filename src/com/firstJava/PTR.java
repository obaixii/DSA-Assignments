package com.firstJava;

import java.util.Scanner;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class PTR {
    public static void main(String[] args) {
        System.out.println("(P, T, R) program to find Simple Interest");
        float simpleInterest , principle , rate ,time ;

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a Principle :: ");
        principle = input.nextFloat();

        System.out.print("Please Enter a Rate :: ");
        rate = input.nextFloat();

        System.out.print("Please Enter a Time :: ");
        time = input.nextFloat();

        simpleInterest = (principle * rate * time) / 100;

        String response = String.format("Your Simple Interest is %s" ,simpleInterest);

        System.out.print(response);
    }
}
