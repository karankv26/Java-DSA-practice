import java.lang.annotation.Target;
import java.util.*;

public class karan {


    public static int fibonacci(int n){
        if (n<=1){
            return n;
        }
        int left = fibonacci(n-1);
        int right = fibonacci(n-2);
        int ans = left + right;
        return ans;
    }
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");      
        int n = sc.nextInt();
        System.out.println(fibonacci(n));

    }
}
