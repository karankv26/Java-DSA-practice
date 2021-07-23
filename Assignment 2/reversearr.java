
import java.lang.reflect.Method;
import java.util.*;

public class karan {

    public static int [] inputArray(){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the size of arr: ");
        int n = sc.nextInt();
        int [] arr= new int[n];

        System.out.printf("Enter %d elements of arr: ",n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.printf("%d elements inserted Successfully.\n",n);
        return arr;
    }

    public static void reverse(int[] arr){
        for(int i =0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }




    public static void main(String[] args) {
        int[] arr = inputArray();
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
