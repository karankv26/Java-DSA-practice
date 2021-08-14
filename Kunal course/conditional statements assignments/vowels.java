package com.company;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args){
        System.out.print("Enter a letter: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if ( c =='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonent");
        }
    }
}
