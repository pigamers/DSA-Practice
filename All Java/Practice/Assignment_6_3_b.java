class Assignment_6_3_b 
{
    public static void main(String p[])
    {
        try
        {
            int data = 100/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }
}