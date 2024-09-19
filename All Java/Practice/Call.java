class Call{
int data=50;
void change(int data){
data=data+100;
}
public static void main(String[] args){
Call c=new Call();
System.out.println("Before change: "+c.data);
c.change(500);
System.out.println("After change: "+c.data);
}
}