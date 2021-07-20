import java.util.*;

public class karan {


    public static void spiral() {
        int arr[][] = { { 17, 24, 321, 447 }, { 54, 65, 76, 878 }, { 91, 102, 113, 124 }, { 135, 146, 157, 168 },
                { 179, 181, 192, 203 } };
        int tle = arr.length * arr[0].length;
        int sr = 0, sc = 0, ec = arr[0].length - 1, er = arr.length - 1;
        int dir = -1;
        while (tle != 0) {
            dir = (dir + 1) % 4;

            if (dir == 0) {
                for (int i = sc; i <= ec; i++) {
                    System.out.print(arr[sr][i] + " ");
                    tle--;
                }
                sr++;
            } else if (dir == 1) {
                for (int i = sr; i <= er; i++) {
                    System.out.print(arr[i][ec] + " ");
                    tle--;
                }
                ec--;
            } else if (dir == 2) {
                for (int i = ec; i >= sc; i--) {
                    System.out.print(arr[er][i] + " ");
                    tle--;
                }
                er--;
            } else {
                for (int i = er; i >= sr; i--) {
                    System.out.print(arr[i][sc] + " ");
                    tle--;
                }
                sc++;
            }

        }
    }

    public static void main(String[] args) {
        spiral();

    }
}
