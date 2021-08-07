import java.lang.annotation.Target;
import java.util.*;

public class karan {

    public static int factorial(int n){
        if(n==0){
        return 1;
        }
        int ans = factorial(n-1);
        int Myans = ans * n;
        return Myans;
    }

    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");      
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);

    }
}
