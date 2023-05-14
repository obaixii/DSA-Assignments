package com.flowOfProgram;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Please Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1*num2;

        String result = String.format("The sum of %d and %d is ::2 %d", num1,num2,sum);

        System.out.println(result);

    }
}
