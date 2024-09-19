#include <stdio.h>
#include <conio.h>
void rev(int start, int end,int length, int arr[]);

void main()
{
	int arr[] = {1,2,3,4,5};
	int length = sizeof(arr) / sizeof(arr[0]);

    int start = 0 , end = length - 1; 
    rev(start,end,length,arr);   
    
}

void rev(int start,int end,int length,int arr[]){
    while (start < end)
    {
        int temp = arr[start];

        arr[start] = arr[end];

        arr[end] = temp;

        start++;
        end--;
    }

    for (int i = 0; i < length; i++)
    {
        printf("%d\t",arr[i]);
    }
}