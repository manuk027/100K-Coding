//search for an element in the array and return the position

#include<stdio.h>
int main(){
    int a[100], size, i, search;
    printf("Enter the size of the array : ");
    scanf("%d", &size);
    printf("Enter the elements to the array : ");
    for (i=0; i<size; i++){
        scanf("%d", &a[i]);
    }
    printf("Enter the element to search : ");
    scanf("%d", &search);
    for (i=0; i<size; i++){
        if (a[i] == search){
            printf("Element found at position %d", i+1);
            break;
        }
        else{
            printf("Element not found!");
            break;
        }
    }
    return 0;
}
