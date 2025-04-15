//Program that accepts a number and checks if it is Positive, negative or Zero

import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		if(num > 0) {
			System.out.println("Number is positive.");
		}else if(num <0) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number is neither positive nor negetive, its zero.");
		}
		s.close();
		}

}
