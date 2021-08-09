package com.company;

import java.util.Scanner;

public class sumtill0 {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num,sum = 0;
        Scanner sc = new Scanner(System.in);
        while ((num = sc.nextInt()) != 0 ){
            System.out.print("Enter a number: ");
            sum = sum + num;
        }

        System.out.println("Sum of entered numbers: " + sum);


    }
}
