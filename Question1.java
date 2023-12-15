import java.util.Scanner;

public class Question1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number : ");
        int n = sc.nextInt();

        if(n%2==0)
        {
           System.out.print("\nThe number "+n+" is Even\n");
        }
        else
        {
           System.out.print("\nThe number "+n+" is Odd\n");
        }
        sc.close();
    }
}
