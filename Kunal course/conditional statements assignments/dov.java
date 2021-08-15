package com.DSA;

import java.util.Scanner;

public class dsv {
    public static void main(String[] args){
        System.out.print("asset cost: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("salvage value: ");
        int b = sc.nextInt();
        System.out.print("useful life: ");
        int c = sc.nextInt();
        int result = (a-b)/c;
        System.out.println("Depreciqation of value: $"+result);
    }
}
