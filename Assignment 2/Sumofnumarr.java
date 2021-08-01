import java.lang.annotation.Target;
import java.util.*;

public class karan {

    public static void printsum(int[] arr, int target) {
        int a,b;
        for (int i = 0; i < arr.length; i++) {
            a = arr[i];
        for (int j = i+1; j < arr.length; j++) {
            b =  target- a;
            if (b == arr[j]) {
                System.out.printf("(%d,%d),", a, b);
            }     
        }
        }
    }

    public static int[] inputarr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");
        int n = sc.nextInt();
        int [] arr= new int[n];

        System.out.printf("Enter %d elements of arr: ",n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = inputarr();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target number: ");
        int target = sc.nextInt();

        printsum(arr,target);

    }
}
