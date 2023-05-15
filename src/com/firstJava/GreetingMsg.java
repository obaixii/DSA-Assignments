package com.firstJava;

import java.util.Scanner;

// Take name as input and print a greeting message for that particular name.
public class GreetingMsg {
    public static void main(String[] args) {
        System.out.println("Greeting Message program");

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Name :: ");

        String name = input.nextLine();

        String message = String.format("Hi %s, Welcome to Java World!",name);

        System.out.print(message);

    }
}
