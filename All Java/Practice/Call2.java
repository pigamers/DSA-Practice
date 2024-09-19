class Call2{
int data=50;
void change(Call2 c){
c.data=c.data+100;
}
public static void main(String[] args){
Call2 c=new Call2();
System.out.println("Before change: "+c.data);
c.change(c);
System.out.println("After change: "+c.data);
}
}