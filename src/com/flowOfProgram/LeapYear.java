package com.flowOfProgram;
// Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){

        int year;
        System.out.print("Please Enter an Year : ");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
        {
            String message = String.format("%d is a leap year", year);
            System.out.println( message);
        } else{
            String message = String.format("%d is a leap year", year);
            System.out.println( message);
        }
    }
}

//   public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please Enter an Year : ");
//        short year = input.nextShort();
//
//        boolean isLeap = false;
//
//        if (year % 4 ==  0){
//
//        }
