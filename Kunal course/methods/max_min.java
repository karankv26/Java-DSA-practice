package com.DSA;

import java.util.Scanner;

public class fun_max_min {


    public static void  main(String[] args){
        max();
// min();
    }
  
  

    static void max() {
        System.out.println("number1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("number2: ");
        int b = sc.nextInt();
        System.out.println("number3: ");
        int c = sc.nextInt();

        if (a > b && a >c){
            System.out.println(a);
        }else if(b>a && b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
  
  
    static void min() {
        System.out.println("number1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("number2: ");
        int b = sc.nextInt();
        System.out.println("number3: ");
        int c = sc.nextInt();

        if (a < b && a <c){
            System.out.println(a);
        }else if(b<a && b<c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
