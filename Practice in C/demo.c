#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool isValid(char *);

void main()
{
    // [[[[[[[[[[[[[[[[[[[
    char s[] = {'[','[','[','[','[','[','[','[','[','[','[','[','[','[','[','[','[','[','['};

    printf(" %d\n", isValid(s));
}
// Function to check if the expression is valid or not
bool isValid(char *s)
{
    int len = sizeof(s) / sizeof(*s);

    if (s[0] == ')' || s[0] == '}' || s[0] == ']')
    {
        return false;
    }

    int *stack;
    int top = -1;
    stack = (int *)malloc(len);

    for (int i = 0; s[i] != '\0'; i++)
    {
        if (s[i] == '(' || s[i] == '{' || s[i] == '[')
        {
            top++;
            stack[top] = s[i];
        }
        else
        {
            if (top == -1)
            {
                return false;
            }
            char temp = stack[top];
            if ((s[i] == ')' && temp == '(') || (s[i] == '}' && temp == '{') || (s[i] == ']' && temp == '['))
            {
                top--;
            }
            else
            {
                return false;
            }
        }
    }

    if (top == -1)
    {
        return true;
    }

    return false;
}