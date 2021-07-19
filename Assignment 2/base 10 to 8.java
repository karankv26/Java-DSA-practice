import java.util.*;

public class karan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int p = 0, ans = 0;
        while (n != 0) {
            ans = (int) Math.pow(10, p) * (n % 8) + ans;
            p++;
            n = n / 8;
        }
        System.out.println(ans);

    }
}
