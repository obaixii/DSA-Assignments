package com.firstJava;

import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Calculator {
    public static void main(String[] args) {
        System.out.println(" Calculator | calculate the values");
        int number1 , number2, result ;
        String  response ;
        char op;

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter first Number :: ");
        number1 = input.nextInt();

        System.out.print("Please Enter second Number :: ");
        number2 = input.nextInt();

        System.out.print("Please Enter your Operand (*,/,+,-) :: ");
        op = input.next().charAt(0);

        result = 0;

        if (op == '+'){
            result = number1 + number2;
        } else if (op == '-'){
            result = number1 - number2;
        }else if (op == '*'){
            result = number1 * number2;
        }else if (op == '/'){
            result = number1 / number2;
        }else {
            System.out.println("Invalid Operator");
            return;
        }

        response = String.format("The Answer is %d" ,result);

        System.out.print(response);

    }
}
