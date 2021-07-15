import java.util.*;

import javax.lang.model.element.Element;

public class karan {



    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        if (swap == false) {
            break;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 985, 3, 1 };
        bubblesort(arr);

    }

}
