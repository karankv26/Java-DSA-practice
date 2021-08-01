import java.lang.annotation.Target;
import java.util.*;

public class karan {

    public static void printsum(int[] arr, int target) {
        int a,b,c;
        for (int i = 0; i < arr.length; i++) {
            a = arr[i];
        for (int j = i+1; j < arr.length; j++) {
            b =  arr[j];
            for (int k = i+2; k < arr.length; k++) {
                c = arr[k];
                if (a+b+c == target) {
                    System.out.printf("(%d,%d,%d),", a, b,c);
                }
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

execution:
Enter the size of arr: 7
Enter 7 elements of arr: 3
1
2
9
7
5
-1
Enter the target number: 9
(3,1,5),(3,7,-1),(3,-1,7),(1,9,-1),(1,-1,9),
