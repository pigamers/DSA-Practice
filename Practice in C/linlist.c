#include <stdio.h>
#include <stdlib.h>
void append();
void addatstart();
void addanywhere(int);
void deletefromstart();
void deletefromend();
void deletefromanywhere();
void display();
int length();
void reversethelist();

struct dabba *root = NULL;
int len;
struct dabba
{
    int data;
    struct dabba *nextdabba;
};

void main()
{
    while (1)
    {
        int ch, pos;
        printf("Enter your choice: \n");
        printf("1.Append\n2.Add at start\n3.Add anywhere\n4.Delete from start\n");
        printf("5.Delete from end\n6.Delete from anywhere\n7.Display\n8.Length\n9.Reverse the list\n10.Exit\n");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            append();
            break;
        case 2:
            addatstart();
            break;
        case 3:
            printf("Enter the position : ");
            scanf("%d", &pos);
            addanywhere(pos);
            break;
        case 4:
            deletefromstart();
            break;
        case 5:
            deletefromend();
            break;
        case 6:
            deletefromanywhere();
            break;
        case 7:
            display();
            break;
        case 8:
            printf("The length of the linked list is : %d\n", length());
            break;
        case 9:
            length();
            reversethelist();
            break;
        case 10:
            exit(0);
        default:
            printf("Wrong choice\n");
            break;
        }
    }
}

void append()
{
    struct dabba *temp;

    temp = (struct dabba *)malloc(sizeof(struct dabba));

    printf("\nEnter the element to be appended : ");
    scanf("%d", &temp->data);
    temp->nextdabba = NULL;
    if (root == NULL)
    {
        root = temp;
    }
    else
    {
        struct dabba *ptr = root;
        while (ptr->nextdabba != NULL)
        {
            ptr = ptr->nextdabba;
        }
        ptr->nextdabba = temp;
    }
    printf("Element %d Appended Successfully!\n", temp->data);
}

void addatstart()
{
    struct dabba *temp;
    temp = (struct dabba *)malloc(sizeof(struct dabba));

    printf("\nEnter the data to add at beginning : ");
    scanf("%d", &temp->data);
    if (root == NULL)
    {
        root = temp;
    }
    else
    {
        temp->nextdabba = root;
        root = temp;
    }
}
void addanywhere(int pos)
{
}
void deletefromstart()
{
    struct dabba *temp = root;

    if (temp == NULL)
    {
        printf("It is empty my frnd!\n");
    }
    else
    {
        root = root->nextdabba;
        printf("Element %d deleted from start!\n", temp->data);
    }
}
void deletefromend()
{
    struct dabba *temp = root, *p;
    if (temp == NULL)
    {
        printf("List is Empty\n");
    }
    else
    {
        while (temp != NULL)
        {
            temp = temp->nextdabba;
            if (temp != NULL)
            {
                p = p->nextdabba;
            }
        }
        p->nextdabba = NULL;
        printf("Element %d removed from end!!\n", temp->data);
    }
}
void deletefromanywhere()
{
}
void display()
{
    struct dabba *temp = root;
    if (temp == NULL)
    {
        printf("no elements in the list\n");
    }
    else
    {
        while (temp != NULL)
        {
            printf("%d\t", temp->data);
            temp = temp->nextdabba;
        }
        printf("\n");
    }
}
int length()
{
    int count = 0;
    struct dabba *temp = root;

    while (temp != NULL)
    {
        count++;
        temp = temp->nextdabba;
    }
    len = count;
    return count;
}
void reversethelist(){
    int i=0,j=length()-1;
    struct dabba *p,*q;
    p = q = root;
    while (i<j)
    {
        int k=0;
        while (k<j)
        {
            q=q->nextdabba;
            k++;
        }
        int temp=p->data;
        p->data = q->data;
        q->data = temp;
        i++;
        j--;
        p=p->nextdabba;
        q=root;
    }
    printf("Reversing Done!!\n");
}