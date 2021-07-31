import java.util.*;

public class karan {

    public static void checkBit(int num, int m) {
        int mask = (1<<(m-1));
        if ((mask&num) != 0){
            System.out.println("On bit");        // 1 means On and 0 means Off.
        }else{
            System.out.println("Off bit");
        }
    }

    public static void setOnbit(int num,int m) {
        int mask = (1<<(m-1));
        int ans = (num|mask);
        System.out.println(ans);
    }

    public static void setOffbit(int num,int m) {
        int mask = (1<<(m-1));
        int ans = (num&(~mask));
        System.out.println(ans);
    }

    public static void togglebit(int num,int m) {
        int mask = (1<<(m-1));
        int ans = (num ^ mask);
        System.out.println(ans);
    }

    public static void singlealagnumber() {
        int arr[] = {56,4,34,76,4,56,76};
        int ans = 0;
        for(int ele: arr){
            ans= (ans^ele);
        }
        System.out.println(ans);
    }

    public static void findalagnumbers() {
        int arr[] = {56,4,34,76,4,18,56,76};
        int ans=0;
        for(int ele : arr){
            ans = (ans^ele);
        }
        int cnt = 0;
        int ans1 = ans;
        while (ans1 % 2 != 1) {
            cnt++;
            ans1 = ans1/2; 
        }
        int mask = (1<<cnt);
        int ans2 = 0;
        for (int ele: arr){
            if((mask&ele)==0){
                ans2= (ans2^ele);
            }
        }
        System.out.println(ans2+" "+(ans^ans2));
    }

  
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter num: ");
        // int num =sc.nextInt(); 
        // System.out.println("Enter m: ");
        // int m = sc.nextInt();
        // checkBit(num,m);
        // setOffbit(num, m);
        // togglebit(num, m);
        // findalagnumbers();
        


    }
}
