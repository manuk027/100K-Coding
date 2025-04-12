#include<stdio.h>
int main(){
	int mul, i, result=1;
	printf("Enter the number:");
	scanf("%d", &mul);
	for(i=1; i<=10; i++){
		result = i*mul;
		printf("%d x %d = %d\n", i, mul, result);
		result=1;
	}
	return 0;
}
