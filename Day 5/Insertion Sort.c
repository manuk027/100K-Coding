#include<stdio.h>
int main(){
    int a[100], i, j, size, temp;
    printf("Enter the size of the array : ");
    scanf("%d", &size);
    printf("Enter %d elements : ", size);
    for(i=0; i<size; i++){
        scanf("%d", &a[i]);
    }
    for (i=0; i<size; i++){
        for (j=i+1; j<size; j++){
            if(a[i] > a[j]){
                temp = a[i];
                a[i] = a[j];
                a[j] =temp;
            }
        }
    }
    printf("Sorted array is : ");
    for (i=0; i<size; i++){
        printf("\n%d", a[i]);
    }
    return 0;
}
