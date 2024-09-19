#include <stdio.h>
#include <conio.h>

void main()
{
    int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};                                          //-2, -3, 4, -1, -2, 1, 5, -3
    int length = sizeof(arr) / sizeof(arr[0]), i = 0, j = 1, sum = 0, maxsum = 0;       // 8

    if (length > 1)
    {
        while (i < length)
        {
            sum = arr[i];
            while (j < length)
            {
                sum = sum + arr[j];

                if (maxsum < sum)
                {
                    maxsum = sum;
                }
                j++;
            }
            i++;
        }
    }
    else
    {
        maxsum = arr[0];
    }
    printf("%d\n", maxsum);
}
/*
int maxSubArray( int* a, int n){
    if (length > 1)
    {
        while (i < length)
        {
            sum = arr[i];
            while (j < length)
            {
                sum = sum + arr[j];

                if (maxsum < sum)
                {
                    maxsum = sum;
                }
                j++;
            }
            i++;
        }
    }
    else
    {
        maxsum = arr[0];
    }
    printf("%d\n", maxsum);



    return 0;

}
*/