
import java.util.*;

public class sumofdigits {
    public static  void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        while (n > 0) {
            int rem = n % 10;
            result = rem+ result;
            n = n / 10;
        }
        System.out.print(result);
    }
}
