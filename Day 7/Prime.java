// Day 7 - Assignment 1

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Number number=new Number();
		System.out.print("Enter a number :");
		number.num = s.nextInt();
		for (int i=2; i<number.num/2; i++) {
			if(number.num % i == 0) {
				number.flag=0;
				break;
			}
		}
		if(number.flag == 1) {
			System.out.println("The number is prime.");
		}else {
			System.out.println("The number is not prime");
		}
		
	}

}

class Number {
	int num;
	int sum;
	int flag=1;
}
