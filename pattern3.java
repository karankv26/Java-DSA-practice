import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int id=1,nst=1,nsp=n-1;
		while(id<=2*n-1){
		     int csp=1;
		    while(csp<=nsp){
		        System.out.print(" ");
		        csp++;
		    }
		    
		    int cst=1;
		    while(cst<=nst){
		        if(cst <= (nst+1)/2){
		            System.out.print(cst);
		        }else{
		             System.out.print(nst-cst+1);
		        }
		        cst++;
		    }
		    System.out.println();
		    if(id<n){
		        nsp--; 
	        	nst=nst+2;
	        	id=id+1;
		    }else{
		        nsp++; 
	    	    nst=nst-2;
	        	id=id+1;
		    }
		    
		}
		
	}
}


execution:
Enter a number: 5
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1
