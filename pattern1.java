import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number:");
	    int n = sc.nextInt();
		int id =1 , nst =1, nsp=4;
		while(id<=n){
		    
		    int csp=1;
		    while(csp<=nsp){
		        System.out.print(" ");
		        csp++;
		    }
		    
		    int cst=1;
		    while(cst<=nst){
		        System.out.print("*");
		        cst++;
		    }
		    
		    System.out.println();
		    nsp--;
		    nst++;
		    id++;
		    
		}
	}
}



execution:
Enter a number:5
    *
   **
  ***
 ****
*****

