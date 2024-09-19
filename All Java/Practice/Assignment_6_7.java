import java.io.IOException;
public class Assignment_6_7 
{
    void m()throws IOException
    {
        throw new IOException("device error.");
    }
    void n()throws IOException
    {
        m();
    }
    void p()
    {
        try
        {
            n();
        }
        catch(Exception e)
        {
            System.out.println("Exception handled.");
        }
    }
    public static void main(String q[])
    {
        Assignment_6_7 obj = new Assignment_6_7();
        obj.p();
        System.out.println("normal flow.");
    }
}