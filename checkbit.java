import java.util.*;

public class karan {

    public static void checkBit(int num, int m) {
        int mask = (1<<(m-1));
        if ((mask&num) != 0){
            System.out.println("On bit");
        }else{
            System.out.println("Off bit");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num =sc.nextInt();
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        checkBit(num,m);


    }
}
