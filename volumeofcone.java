

import java.util.Scanner;

public class cone {

    public static void main(String[] args) {
        System.out.print("enter the radius of cone: ");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        System.out.print("enter the height of cone: ");
        int h = in.nextInt();

        double volume;
        volume = (3.14 * Math.pow(r,2) *h)/3;
        System.out.println("volume of cone : " + volume);

    }
}
