class Person{  
int id;  
String name;  
Person(int id,String name){  
this.id=id;  
this.name=name;  
}  
}  
class Employee extends Person{  
float salary;  
Employee(int id,String name,float salary){  
super(id,name);  
this.salary=salary;  
}  
void display(){
System.out.println(id+" "+name+" "+salary);
}  
}  
class TestSuper1{  
public static void main(String[] args){  
Employee e1=new Employee(1,"Debayan",45000f);  
e1.display();  
}
}  
