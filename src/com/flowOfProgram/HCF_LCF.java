package com.flowOfProgram;

import java.util.Scanner;

public class HCF_LCF {
    public static void main(String[] args) {
        System.out.println("FIND H.C.F AND L.C.F OF TWO NUMBERS");

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number :: ");
        int num1 = input.nextInt();

        System.out.print("Please enter first number :: ");
        int num2 = input.nextInt();

        int inp1 = num1;
        int inp2 = num2;

        while(inp2 != 0){

            int temp = inp2;

            inp2 = inp1%inp2;
            inp1 = temp;
        }

        int hcf = inp1;
        int lcf = (num1*num2)/hcf;


        System.out.println(String.format("HCF of input numbers(%d,%d) is : %d",num1,num2, hcf));
        System.out.println(String.format("LCF of input numbers(%d,%d) is : %d",num1,num2, lcf));

    }
}
