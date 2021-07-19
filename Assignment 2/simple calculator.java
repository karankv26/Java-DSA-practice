

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

        char operator;
        double n1,n2,result;
        Scanner sc = new Scanner(System.in);
        System.out.print("n1: ");
        n1 = sc.nextInt();
        System.out.print("n2: ");
        n2 = sc.nextInt();
        System.out.print("Enter a charactor: ");
        operator = sc.next().charAt(0);

        switch (operator) {

        case '+':
        result = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
        break;

        case '-':
        result = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + result);
        break;

        case '*':
        result = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + result);
        break;

        case '/':
        result = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + result);
        break;
        
        case '%':
        result = n1 % n2;
        System.out.println(n1 + " % " + n2 + " = " + result);
        break;

        default:
        System.out.println("Invalid operator!");
        break;
        }
        sc.close();
  }
}
