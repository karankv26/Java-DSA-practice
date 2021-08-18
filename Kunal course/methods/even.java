package com.DSA;

import java.util.Scanner;

public class fun_max_min {


    public static void  main(String[] args){
//        max();
        even();

    }

    static void even(){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
    }
    
}
