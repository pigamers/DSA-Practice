#include <stdio.h>
#include <stdlib.h>

int search(int *, int, int);

void main()
{
    int *nums;
    int len, i, target;
    printf("Enter the size of the Array: ");
    scanf("%d", &len);
    nums = (int *)malloc(len * sizeof(int));

    printf("Array Elements: \n");
    for (int i = 0; i < len; i++)
    {
        scanf("%d", &nums[i]);
    }

    printf("Enter the target value: ");
    scanf("%d", &target);

    int res =  search(nums, len, target);
    printf("%d",res);
}

int search(int *nums, int size, int target)
{
    int flag =0;
    for (int i = 0; i < size; i++)
    {
        if (target == nums[i])
        {
            return i;
            flag++;
        }
    }

    if (flag == 0)
    {
        return -1;
    }
    
}
/*

void main()
{
    int arr[] = {4, 5, 6, 7, 0, 1, 2};

}
*/