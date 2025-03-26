//Calculator using elseif ladder
#include<stdio.h>
int main(){
	float a, b, result;
	int choice;
	printf("Enter first number:");
		scanf("%f", &a);
	printf("Enter first number:");
		scanf("%f", &b);
	printf("Enter your choice\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
	scanf("%d", &choice);
	if(choice == 1){
		result = a+b;
		printf("%.2f + %.2f = %.2f", a, b, result);
	}
	else if(choice == 2){
		result = a-b;
		printf("%.2f - %.2f = %.2f", a, b, result);
	}
	else if(choice == 3){
		result = a*b;
		printf("%.2f x %.2f = %.2f", a, b, result);
	}
	else if(choice == 4){
		result = a/b;
		printf("%.2f / %.2f = %.2f", a, b, result);
	}
	else{
		printf("You are a fool.");
	}
	return 0;
}
