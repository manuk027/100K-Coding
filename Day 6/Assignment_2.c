#include<stdio.h>
int main(){
	int size, i, j, arr1[100][100], arr2[100][100], temp;
	printf("Enter the size of the array : ");
	scanf("%d", &size);
	printf("Enter elements to array 1 :\n");
	for(i=0; i<size; i++){
		for(j=0; j<size; j++){
			scanf("%d", &arr1[i][j]);
		}
	}
	printf("Enter elements to array 2 :\n");
	for(i=0; i<size; i++){
		for(j=0; j<size; j++){
			scanf("%d", &arr2[i][j]);
		}
	}
	printf("The array after adding two array is : ");
	for(i=0; i<size; i++){
		for(j=0; j<size; j++){
			temp = arr1[i][j] + arr2[i][j];
			printf("%d\t", temp);
			temp=0;
		}
		printf("\n");
	}
	return 0;
}

