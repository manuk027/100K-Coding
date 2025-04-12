#include<stdio.h>
int main(){
    int p;
    float r, n, si;
    printf("Enter the Principal amount:");
    scanf("%d", &p);
    printf("Enter the Interest Rate:");
    scanf("%f", &r);
    printf("Enter Number of years:");
    scanf("%f", &n);
    si = ((p*r*n)/100);
    printf("The simple interest for an amount of %d at an interset rate of %.2f for %.2f years is %.4f", p, r, n, si);
    return 0;
}
