class Assignment_6_5 
{
     public static void main(String p[])
     {
         try
         {
             try
             {
                 System.out.println("divide by 0");
                 int b = 40/0;
             }
             catch(ArithmeticException e)
             {
                 System.out.println(e);
             }
             try
             {
                 int a[] = new int[5];
                 a[5] = 4;
             }
             catch(ArrayIndexOutOfBoundsException e)
             {
                 System.out.println(e);
             }
             System.out.println("some statements.");
         }
         catch(Exception e)
         {
             System.out.println("Handeled the exception.");
         }
         System.out.println("rest of the codes...");
     }
}