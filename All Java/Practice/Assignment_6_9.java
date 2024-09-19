class CheckArgument extends Exception{}
public class Assignment_6_9 
{
    public static void main(String p[])
    {
        int i, j, ans = 0;
        int s[] = new int[5];
        try
        {
            int count = 0;
            for(i = 0; i < s.length; i++)
            {
                s[i] = Integer.parseInt(p[i]);
                count++;
                if(p.length < 5)
                {
                    throw new CheckArgument();
                }
                else if(p.length > 5)
                {
                    throw new CheckArgument();
                }
            }
            for(i = 0; i < s.length; i++)
            {
                ans = ans + s[i];
            }
        }
        catch(CheckArgument m)
        {
            System.out.println("Please pass 5 integers.");
        }
        System.out.println("The sum is "+ans);
    }
}