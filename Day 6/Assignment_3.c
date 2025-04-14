#include<stdio.h>
void getArray(int array[], int size);
void displayArray(int array[], int size);
int main(){
	int array[100], size;
	printf("Enter size of the array:");
		scanf("%d", &size);
		getArray(array, size);
	displayArray(array, size);
	return 0;
}

void getArray(int array[], int size){
	int i;
	printf("Enter elements into array\n");
	for (i=0; i<size; i++){
		scanf("%d", &array[i]);
	}
}

void displayArray(int array[], int size){
	int i;
	printf("Elements in the array : ");
	for(i=0; i<size; i++){
		printf("\n%d", array[i]);
	}
}
