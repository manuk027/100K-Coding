#include<stdio.h>
int main(){
	int size, i, array[100], even = 0;
	printf("Enter the size of an array : ");
	scanf("%d", &size);
	printf("Enter %d elements : ", size);
	for (i=0; i<size; i++){
		scanf("%d", &array[i]);
		if(array[i]%2 == 0){
			even+=1;
		}
	}
	printf("Number of even numbers in the given array is %d", even);
	return 0;
}
