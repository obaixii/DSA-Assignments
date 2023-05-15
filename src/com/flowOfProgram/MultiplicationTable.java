package com.flowOfProgram;
// Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        for (int i = 0; i<10; i++ ){
            System.out.println(String.format("%d x %d = %d", num, i+1, num*(i+1)));
        }
    }
}
