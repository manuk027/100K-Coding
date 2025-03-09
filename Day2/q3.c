/*Write a program to find the simple interest.
Program should accept 3 inputs from the user and calculate simple interest for the given inputs. Formula: SI=((P*R*n)/100)
Principal amount (P) - Integer
Interest rate (R) - Float
Number of years (n) - Float
Simple Interest (SI) - Float
*/


#include<stdio.h>
int main(){

    //variable declaration
    int p;
    float r, n, si;
    
    //promting and storing the values to variables from the users
    printf("Enter the Principal amount:");
    scanf("%d", &p);
    printf("Enter the Interest Rate:");
    scanf("%f", &r);
    printf("Enter Number of years:");
    scanf("%f", &n);

    //calculating simple interest
    si = ((p*r*n)/100);

    //printing simple interest
    printf("The simple interest for an amount of %d at an interset rate of %.2f for %.2f years is %.4f", p, r, n, si);

    return 0;
}
