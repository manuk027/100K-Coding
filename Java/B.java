//Progrm to add a numbers upto a limit.

import java.util.Scanner;
public class B {
	public static void main(String[] args) {
		int sum=0, i; 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=s.nextInt();
		for(i=0; i<limit; i++) {
			sum+=i;
		}
		System.out.println("Sum is : "+sum);
		s.close();
		}

}
