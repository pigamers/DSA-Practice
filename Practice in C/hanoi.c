#include <stdio.h>
void Hanoi(int,char,char,char);

void main(){
    
    Hanoi(5,'A','B','C');

}

void Hanoi(int n,char from,char via,char to){
    if (n==1)
    {
        printf("\nDisk moved from %c to %c",from,to);
        return;
    }
    Hanoi(n-1,from,via,to);

    printf("\nDisk %d moved from %c to %c",n,from,to);

    Hanoi(n-1,via,to,from);
    
}
