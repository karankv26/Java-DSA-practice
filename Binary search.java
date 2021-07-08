import java.util.*;

public class karan {



    public static void binarysearch(int arr[]) {
        int l = 0, h = arr.length - 1;
        int ans = -1;
        int element = 50;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == element) {
                ans = 1;
                System.out.println("Element found");
                break;
            } else if (arr[mid] > element) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (ans == -1) {
            System.out.println("element not found");

        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 10, 15, 40, 50 };
        binarysearch(arr);
    }
}
