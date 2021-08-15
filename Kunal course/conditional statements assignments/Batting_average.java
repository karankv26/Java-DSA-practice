package com.DSA;

import java.util.Scanner;

public class batting_avg {
    public static void main(String[] args){
        System.out.print("Enter the score: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the number of wickets: ");
        int b = sc.nextInt();
        int result = a/b;
        if (result < 10) System.out.println(result + ",poor batting skills!");
        else if (result >= 10 && result <20) System.out.println(result + ",Average batting skills!");
        else if (result >= 20 && result <30) System.out.println(result + ",Above average batting skills!");
        else if (result >= 30 && result <40) System.out.println(result + ",good batting skills!");
        else if (result >= 40 && result <50) System.out.println(result + ",very good batting skills!");
        else System.out.println(result + ",extraordinary batting skills!");
    }
}
