import java.util.*;

public class karan {

    public static void upperandlower() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is uppercase alphabet.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is lowercase alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }

    public static void main(String[] args) {
        upperandlower();
    }
}
