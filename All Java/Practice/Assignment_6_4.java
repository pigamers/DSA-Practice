class Assignment_6_4 
{
    public static void main(String p[])
    {
    try
    {
        int a[] = new int[5];
        a[5] = 30/0;
        System.out.println(a[10]);
    }    
    catch(ArithmeticException e) 
    {
        System.out.println("Arithmetic Exception occured.");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("ArrayIndexOutOfBounds Exceptions occured.");
    }
    catch(Exception e)
    {
        System.out.println("Parent Exception occurred.");
    }
    System.out.println("rest of the code.");
}
}