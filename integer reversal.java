import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number- ");  
	    int n= input.nextInt();  
		int novo = 0, houtan =0;
		while(n != 0){
		    houtan = n % 10;
		    novo = houtan + novo*10;
		    n = n/10;
		}
		
		System.out.println(novo);
	}
}
