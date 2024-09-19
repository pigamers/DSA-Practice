#include <stdio.h>
// #include <stdbool.h>
#include <stdlib.h>

// int Dup(int [], int);

int main()
{
    int nums[] = {2, 14, 18, 22, 22}, n = 5; // 1,1,1,3,3,4,3,2,4,2
    // nums = (int *)malloc(n * sizeof(int));

    printf("Array Elements: \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", nums[i]);
    }
    printf("\n");

    int i, j, flag = 0;

    for (i = 0; i < n; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (nums[i] == nums[j])
            {
                flag = 1;
                break;
            }
        }
    }
    if (flag == 1)
    {
        printf("yes");
    }
    else
    {
        printf("NO");
    }

    // printf("%d\n", Dup(nums, n));
}
/*
int Dup(int nums[], int n)
{

}
*/
