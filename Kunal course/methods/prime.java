package com.DSA;

import java.util.Scanner;

public class prime {

    static void prime(){
        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("not prime");
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("not prime");
            }
        }
        System.out.println("Prime");


    }
    public static void main(String[] args){
        prime();
    }
}
