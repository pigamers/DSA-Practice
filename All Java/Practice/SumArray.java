import java.util.Scanner;
public class SumArray {
public static void main (String[] args) {
int size, sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements: ");
size=sc.nextInt();
int []a=new int[size];
System.out.println("Enter the elements: ");
for(int i=0;i<size;i++) {
a[i]=sc.nextInt();
}
for(int i=0;i<size;i++){
if(a[i]%2 ==0){
sum+= a[i];
}
}
System.out.println("The sum of even numbers in this array: " + sum);
}
}