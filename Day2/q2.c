//Accept two inputs from the user and output its sum
//number1 = integer
//number2 = float
//sum = float

#include<stdio.h>
int main(){

    //variable declaration
    int num1;
    float num2, sum;

    //Promting the user to input 2 numbers and storing it in variables
    printf("Enter first number:");
    scanf("%d", &num1);
    printf("Enter second number:");
    scanf("%f", &num2);

    //calculating and printing sum
    sum = num1 + (float)num2;
    printf("The sum of %d and %f is %f", num1, num2, sum);

    return 0;
}
