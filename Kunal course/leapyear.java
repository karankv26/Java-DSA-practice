package com.company;

import java.util.Scanner;

public class leapyear {
    public static  void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if((n%4==0 && n%100!=0) || (n%400==0)){
            System.out.println("leap year");
        }else{
            System.out.println("Not yeap year");
        }
    }
}
