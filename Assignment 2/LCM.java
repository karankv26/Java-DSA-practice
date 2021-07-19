import java.util.*;

public class karan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int n2 = scanner.nextInt();
        int gcd = 1;
        int Lcm;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        Lcm = (n1 * n2) / gcd;
        System.out.printf("LCM of %d and %d is %d\n", n1, n2, Lcm);
    }
}
