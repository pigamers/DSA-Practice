#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
void push();
int pop(void);
void peek(void);
void traverse(void);
bool isEmpty(void);
bool isFull(void);
void menu(void);

int top = -1;
int n;
int *stack;

void main()
{
    printf("Enter the size of stack: ");
    scanf("%d", &n);
    // Allocating memory dynamically for the stack
    stack = (int *)calloc(sizeof(int), n);

    menu();
}

void menu()
{
    while (1)
    {
        int choice;
        printf("\nMenu:\n");
        printf("1. Push\n2. Pop\n3. Peek\n4. Traverse\n5. Is Empty?\n6. Is Full?\n7. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            peek();
            break;
        case 4:
            traverse();
            break;
        case 5:
            printf("%d", isEmpty());
            break;
        case 6:
            printf("%d", isFull());
            break;
        case 7:
            exit(0);
        default:
            printf("Invalid Choice!\n");
        }
    }
}

void push()
{
    if (isFull())
    {
        printf("The Stack is full!!");
    }
    else
    {
        int element;

        printf("Enter an element to insert\n");
        scanf("%d", &element);

        top++;
        stack[top] = element;
        printf("\n%d Pushed to the Stack\n", element);
    }
}

int pop()
{
    if (isEmpty())
    {
        printf("No elements to Pop \n");
    }
    else
    {
        printf("%d Popped from the Stack\n", stack[top]);
        top--;
    }
    return top;
}

void peek()
{
    if (isEmpty())
    {
        printf("No elements to peek \n");
    }
    else
    {
        printf("Top element : %d\n", stack[top]);
    }
}

void traverse()
{
    if (isEmpty())
    {
        printf("Stack is empty.\n");
    }
    else
    {
        for (int i = 0; i <= top; i++)
        {
            printf("%d ", stack[i]);
        }
    }
}

bool isEmpty()
{
    if (top == -1)
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool isFull()
{
    if (top == n-1)
    {
        return true;
    }
    else
    {
        return false;
    }
}