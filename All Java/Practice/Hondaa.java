class Bike{  
  final void run(){
System.out.println("running");
}  
}       
class Hondaa extends Bike{  
   void run(){
System.out.println("running safely with 100kmph");
}    
   public static void main(String args[]){  
   Hondaa h= new Hondaa();  
   h.run();  
   }  
}