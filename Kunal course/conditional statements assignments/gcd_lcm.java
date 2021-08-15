package com.DSA;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int n2 = scanner.nextInt();
        int lcm = 0;
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        lcm = (n1*n2)/gcd;
        System.out.printf("GCD of %d and %d is %d\n", n1, n2, gcd);
        System.out.printf("LCM of %d and %d is %d\n", n1, n2, lcm);

    }
}
