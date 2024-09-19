#include <stdio.h>
#include <stdlib.h>

void main()
{
    int nums[] = {1, 2, 3, 1};
    int len = sizeof(nums) / sizeof(nums[0]);

    struct hashTable
    {
        int data;
        struct hashTable *address;
    };
    struct hashTable *base;

    base = (struct hashTable *)malloc(sizeof(struct hashTable));

    if (base == NULL)
    {
        printf("Sorry\n");
    }
    else
    {
        for (int i = 0; i < len; i++)
        {
            
        }
        
    }
}