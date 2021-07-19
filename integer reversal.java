import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number- ");  
	    int n= input.nextInt();  
		int new = 0, rem =0;
		while(n != 0){
		    rem = n % 10;
		    new = rem + new*10;
		    n = n/10;
		}
		
		System.out.println(new);
	}
}
