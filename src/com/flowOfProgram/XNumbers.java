package com.flowOfProgram;
// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class XNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers, press enter to add more number, Enter 'x' to stop the program");

        int sum = 0;
        String val = "";

        while(!val.equals("x")){
            val = input.nextLine();
            if (val.equals("x")){
                break;
            }
            int number =  Integer.parseInt(val);
            sum+=number;
        }

        String response = String.format("Sum of entered numbers: %d",sum);

        System.out.println(response);
    }
}
