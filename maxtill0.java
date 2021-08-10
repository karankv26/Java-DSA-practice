package com.company;

import java.util.Scanner;

public class largesttill0 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num,sum = 0;
        Scanner sc = new Scanner(System.in);
        while ((num = sc.nextInt()) != 0 ){
            System.out.print("Enter a number: ");
            for (int i = 1; i < args.length; i++) {
                
            }
            int max = 0;
            if (max < num) {
                sum = num;
            }
        }

        System.out.println("Max of entered numbers: " + sum);
    }
}
