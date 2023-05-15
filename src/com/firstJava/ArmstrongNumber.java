package com.firstJava;

import java.math.BigInteger;
import java.util.Scanner;

// To find Armstrong Number between two given number.
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong Number Program");

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter first Number :: ");
        int num1 = input.nextInt();

        System.out.print("Please Enter second Number :: ");
        int num2 = input.nextInt();

        for (int i = num1; i<num2; i++){
            int check, rem, sum = 0;
            check = i;
            while(check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if(sum == i){
                System.out.println(""+i+" is an Armstrong number.");
            }
        }


    }
}
