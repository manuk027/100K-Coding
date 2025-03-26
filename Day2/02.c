#include<stdio.h>
int main(){
	int number1 ;
	float number2, sum;
	printf("Enter first numbers:");
	scanf("%d", &number1);
	printf("Enter second numbers:");
	scanf("%f", &number2);
	sum = number1 + number2;
	printf ("The sum of %d and %.2f is %.2f", number1, number2, sum);
	return 0;
}
