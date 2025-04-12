#include<stdio.h>
int main(){
	int size, i, array1[100], array2[100], temp[100];
	printf("Enter the size of the array:");
	scanf("%d", &size);
	printf("Enter the values of array1");
	for(i=0; i<size; i++){
		scanf("%d", &array1[i]);
	}
	printf("Enter the values of array2");
	for(i=0; i<size; i++){
		scanf("%d", &array2[i]);
	}
	for(i=0; i<size; i++){
		temp[i]=array1[i];
		array1[i]=array2[i];
		array2[i]=temp[i];
	}
	printf("Arrray1:");
	for(i=0; i<size; i++){
		printf("\n%d", array1[i]);
	}
	printf("Arrray2:");
	for(i=0; i<size; i++){
		printf("\n%d", array2[i]);
	}
	return 0;

}
