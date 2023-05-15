package com.firstJava;

import java.util.Scanner;

// To find out whether the given String is Palindrome or not.
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println("Is String Palindrome or not?");

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a String :: ");

        String string = input.nextLine().toLowerCase();
        boolean flag = true;

        for(int i = 0; i < string.length()/2; i++){
            // This will check if the character at the current index (i) is not equal to the character at the corresponding position from the end.

            if(string.charAt(i) != string.charAt(string.length()-i-1)){
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("Given string is Palindrome");
        else
            System.out.println("Given string is not a Palindrome");
}
}
