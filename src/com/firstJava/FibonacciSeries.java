package com.firstJava;

import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number :: ");

        int number = input.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series up to " + number + " terms: ");
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 0; i <= number; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
