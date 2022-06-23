package com.test.test.task.two;

import java.util.Scanner;

public class Main {

    public static int[] getArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number...");
        Scanner scanner = new Scanner(System.in);
         int size ;
        size = scanner.nextInt();
        int [] array = getArray(new int[size]);
        int counter = 0;
        for (int j : array) {
            if (j % 2 != 0 && j > 0) {
                counter++;
            }

            System.out.print(j + "|");
        }
        System.out.println();
        System.out.println("number of positive and odd numbers: " + counter);
    }

}