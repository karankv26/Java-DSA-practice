import java.util.*;

import javax.lang.model.element.Element;

public class karan {

    

    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int m = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[m]) {
                    m = j;
                }
            }
            if (m != i) {
                int t = arr[m];
                arr[m] = arr[i];
                arr[i] = t;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    

    public static void main(String[] args) {
        int arr[] = { 2, 13, 52, 62, 985, 38, 109 };
        
        selectionsort(arr);

    }

}
