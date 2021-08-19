package com.DSA;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        factorial();
    }

    private static void factorial() {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 1;
        for (int j = 1; j <= num; j++) {
            result = result * j;

        }
        System.out.println(result);
    }

}
