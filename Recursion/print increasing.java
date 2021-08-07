import java.lang.annotation.Target;
import java.util.*;

public class karan {

    public static void printIncreasing(int n){
        if(n==0){
        return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");      
        int n = sc.nextInt();
        printIncreasing(n);

    }
}
