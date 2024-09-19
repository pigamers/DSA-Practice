#include <stdio.h>
#include <conio.h>
int maxmin(int max, int arr[], int length,int min);

void main()
{
	int arr[] = {5, 1, 100, 12, 7, 23};
	int length = sizeof(arr) / sizeof(arr[0]);

	int max = arr[0];
	int min = arr[0];
	int a = maxmin(max,arr,length,min);
	printf("%d\n",a);
}

int maxmin(int max, int arr[], int length,int min){
	for (int i = 1; i < length; i++)
	{
		if (max > arr[i])
		{
			max = arr[i];
			return max;
		}

		if (min < arr[i])
		{
			min = arr[i];
			return min;
		}
	}
}