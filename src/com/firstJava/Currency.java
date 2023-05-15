package com.firstJava;

import java.util.Scanner;

// Input currency in rupees and output in USD.
public class Currency {
    public static void main(String[] args) {
        System.out.println(" Currency Convertor | Rs to Usd");
        int value1 , convert ;
        String  response ;

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Value in Rupees :: ");
        value1 = input.nextInt();

        convert = value1 * 288;

        response = String.format("Rs %d equals %d USD",value1,convert);

        System.out.println(response);

    }
}

