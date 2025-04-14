#include<stdio.h>
int main(){
	char string[25], i, len=0, flag=0;
	printf("Enter a string :");
	scanf("%s", string);
	for(i=0; string[i] != '\0'; i++){
		len += 1;
	}
	for (i=0; i<len/2; i++){
		if(string[i] != string[len-1-i]){
			flag=1;
			break;
		}
	}
	if(flag == 1){
		printf("String is not palindrome.");
	}else{
		printf("String is palindrome");
	}
	return 0;
}
