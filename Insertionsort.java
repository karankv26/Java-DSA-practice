import java.util.*;

import javax.lang.model.element.Element;

public class karan {

    public static void insertionsort(int arr[]) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 985, 3, 1 };
        insertionsort(arr);

    }

}




execution:

1 1 2 3 5 6 985
