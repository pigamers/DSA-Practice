#include <stdio.h>
#include <stdlib.h>
void next(int *, int);

void main()
{
    int *arr, n = 3;
    arr = (int *)malloc(n * sizeof(int));

    printf("Array Elements: \n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Next Set of Elements: \n");

    next(arr, n);

    for (int i = 0; i < n; i++)
    {
        printf("%d", arr[i]);
    }
}

void next(int *arr, int n)
{
    int max = arr[0], loc, temp;

    for (int i = 0; i < n; i++)
    {
        if (max < arr[i])
        {
            max = arr[i];
            loc = i;
        }
    }
    if (loc == n - 1)
    {
        temp = arr[loc - 1];
        arr[loc - 1] = max;
        arr[loc] = temp;
    }
    else if (loc == n-2)
    {
        
    }
    else
    {
        temp = arr[n - 1];
        arr[n - 1] = max;
        arr[0] = temp;
    }
}
