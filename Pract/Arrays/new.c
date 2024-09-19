#include <stdio.h>
int new(int[], int, int, int);

int main()
{
    // int a = 10,b = 0;
    // b=a;
    // printf("%d\n",b);
    // printf("%d\n",a);
    int arr[] = {4, 5, 6, 7, 0, 1, 2}, target = 10, flag = 0;
    int len = sizeof(arr) / sizeof(arr[0]);

    printf("%d\n",new(arr,len,target,flag));

}
int new(int arr[], int len, int target, int flag)
{
    for (int i = 0; i < len; i++)
    {
        if (target == arr[i])
        {
            // printf("%d", i);
            flag++;
            return i;
        }
    }
    if (flag == 0)
    {
        return -1;
    }
}