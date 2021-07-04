import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int a=n, temp=0, count=0, power=1, power2=1, num1, num2, num3;
		while(a != 0){
			a/=10;
			count++;
		}
		if(k == count || k==0){
			System.out.println(n);
		}
		else {
				if(k < 0){
					k=count+k;
				}
				k %= count;
				temp=count-k;
				
				while(k != 0){
					k--;
					power *= 10;
				}
				
				while(temp != 0){
					temp--;
					power2 *= 10;
				}
				
			num1=n % power;
			num2=n / power;
			num3=num1*power2 + num2;
			System.out.println(num3);
		}
	}
}
