#include<stdio.h>
void main(){
    int num1;
    float num2, sum;
    printf("Enter an integer number : ");
    scanf("%d", &num1);
    printf("Enter a floating number : ");
    scanf("%f", &num2);
    sum = num1 + num2;
    printf("Sum of %d and %.2f is %.2f", num1, num2, sum);
}
