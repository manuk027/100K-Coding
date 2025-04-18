import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Operation oper=new Operation();
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
		System.out.print("\nSelect an option (1-4):");
		oper.a=sc.nextInt();
		System.out.println("\nEnter 2 numbers ");
		oper.num1=sc.nextInt();
		oper.num2=sc.nextInt();
		
		switch(oper.a) {
		case 1 :
			oper.addition(oper.num1, oper.num2);
			break;
		case 2 :
			oper.subtraction(oper.num1, oper.num2);
			break;
		case 3 :
			oper.multiplication(oper.num1, oper.num2);
			break;
		case 4 :
			oper.division(oper.num1, oper.num2);
			break;
		}
		
	}

}

class Operation{
	int a, num1, num2;
	int result;
	
	void addition(int num1, int num2){
		result = num1+num2;
		System.out.println("\nResult is : "+result);
	}
	
	void subtraction(int num1, int num2) {
		result = num1-num2;
		System.out.println("\nResult is : "+result);
	}
	
	void multiplication(int num1, int num2) {
		result = num1*num2;
		System.out.println("\nResult is : "+result);
	}
	
	void division(int num1, int num2) {
		result = num1/num2;
		System.out.println("\nResult is : "+result);
	}
}
