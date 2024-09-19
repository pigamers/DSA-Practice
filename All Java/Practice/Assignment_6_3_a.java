class Assignment_6_3_a
{
    public static void main(String p[])
    {
        try
        {
            int data = 100/10;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }
}