
import java.lang.reflect.Method;
import java.util.*;

public class karan {



    static void swap(int[] arr,int n1,int n2){
        int temp = arr[n1];
        arr [n1] = arr [n2];
        arr[n2] =  temp;
    }


    static boolean isOdd(int a){
        if (a % 2 != 0) {
            return true;
        }
        return false;
    }

    public static void sortOddEven(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (isOdd(arr[i])){
                for (int j = i+1; j < arr.length; j++) {
                    if (!isOdd(arr[j])) {
                        swap(arr,i,j);
                        break;
                    }
                }
            }
        }
    }




    public static void main(String[] args) {
       
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(Arrays.toString(arr));
        sortOddEven(arr);
        System.out.println(Arrays.toString(arr));

    }
}



execution:

[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
[2, 4, 6, 8, 10, 12, 7, 1, 9, 5, 11, 3]
