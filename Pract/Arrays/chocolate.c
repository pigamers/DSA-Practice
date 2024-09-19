#include <stdio.h>
void ssort(int, int, int, int[]);
void swap(int[], int, int, int);
int subarray(int[], int, int);
void printarray(int[], int);

void main()
{
    int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50}, m = 7;
    int len = sizeof(arr) / sizeof(arr[0]), min, pos;

    ssort(len, min, pos, arr);
    printarray(arr, len);

    printf("%d\n", subarray(arr, m, len));
}

int subarray(int arr[], int m, int len)
{
    int mindiff = arr[m - 1] - arr[0];

    for (int i = 0; i <= len - m; i++)
    {
        if (mindiff > arr[m + i - 1] - arr[i])
        {
            mindiff = arr[m + i - 1] - arr[i];
        }
    }

    return mindiff;
}

void printarray(int arr[], int len)
{
    for (int i = 0; i < len; i++)
    {
        printf("%d\t", arr[i]);
    }
    printf("\n");
}

void ssort(int len, int min, int pos, int arr[])
{
    for (int i = 0; i < len - 1; i++)
    {
        for (int j = i + 1; j < len; j++)
        {
            min = arr[i];
            pos = i;

            if (min > arr[j])
            {
                min = arr[j];
                pos = j;
            }
            if (pos != i)
            {
                swap(arr, min, pos, i);
            }
        }
    }
}
void swap(int arr[], int min, int pos, int i)
{
    int t = arr[i];
    arr[i] = min;
    arr[pos] = t;
}