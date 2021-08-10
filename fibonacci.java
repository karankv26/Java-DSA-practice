package com.company;

import java.util.Scanner;

public class fibonacci {
    public static  void main(String[] args){
        System.out.print("enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0,b=1;
        int count = 2;
        while (count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }

        System.out.println(b);
    }

}
