
import java.util.*;

public class karan {

    public static void pattern(int n) {

        int nst1 = 1;
        int nst2 = 1;
        int nsp = n - 1;
        int id = 1;
        while (id <= n) {
            int cst1 = 1;
            while (cst1 <= nst1) {
                System.out.print("*");
                cst1++;
            }
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            int cst2 = 1;
            while (cst2 <= nst2) {
                System.out.print("*");
                cst2++;
            }
            if (id <= n / 2) {
                nst1 = nst1 + 1;
                nst2 = nst2 + 1;
                nsp = nsp - 2;
            } else {
                nst1 = nst1 - 1;
                nst2 = nst2 - 1;
                nsp = nsp + 2;
            }
            System.out.println();
            id++;

        }

    }

    public static void main(String[] args) {
        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);

    }
}
