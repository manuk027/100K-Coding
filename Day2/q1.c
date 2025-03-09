//Accept a char input from the user and display it on the console


#include<conio.h>
int main(){

    //variable declaration
    char c;

    //prompting user to input a charcater
    printf("Enter a charcater:");

    //storing charcater into the variable 'c'
    scanf("%c", &c);

    //printing the character stored in c
    printf("The character you entered is, %c", c);
    return 0;
}
