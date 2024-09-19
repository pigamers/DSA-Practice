import java.util.Scanner;
class RangeException extends Exception{}
public class Assignment_6_10 
{
    public static void main(String p[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        int i, per, sum = 0;
        int s[] = new int[6]; 
        System.out.println("Enter your marks for 6 subjects: ");
        try
        {
            for(i = 0; i < 6; i++)
            {
                System.out.println(i+1+": ");
                s[i] = sc.nextInt();
                if(s[i] < 0)
                {
                    throw new RangeException();
                }
                else if(s[i] > 50)
                {
                    throw new RangeException();
                }
            }
            for(i = 0; i < 6; i++)
            {
                sum = sum + s[i];
            }
        }
        catch(RangeException e)
        {
            System.out.println("Marks are out of range. Please enter correct marks.");
        }
        per = sum*2/6;
        System.out.println(name+", you got "+per+"%");
    }
}