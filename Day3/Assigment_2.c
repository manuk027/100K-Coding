#include<stdio.h>
int main(){
	float mark;
	printf("Enter the mark:");
	scanf("%f", &mark);
	if (mark >= 90 & mark <= 100){
		printf("Grade : A");
	}else if (mark >= 80 & mark <= 89){
		printf("Grade : B");
	}else if (mark >= 70 & mark <= 79){
		printf("Grade : C");
	}else if (mark >= 60 & mark <= 69){
		printf("Grade : D");
	}else if (mark >= 50 & mark <= 59){
		printf("Grade : E");
	}else if (mark >= 0 & mark <= 49){
		printf("Failed!");
	}else{
		printf("Enter a valid mark!");
	}
	return 0;
}
