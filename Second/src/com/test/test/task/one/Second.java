package com.test.test.task.one;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter first number...");
            int number1 = scanner.nextInt();
            System.out.println("enter second number...");
            int number2 = scanner.nextInt();

            int result = number1 + number2;
            int multi = number1 * number2;
            System.out.println("sum of entered numbers: " + result);
            System.out.println("product of entered numbers: " + multi);
            String str = scanner.next();
            if(str.equals("exit")){
                break;
            }
        }
    }
}