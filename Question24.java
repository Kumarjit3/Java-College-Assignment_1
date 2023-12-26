import java.util.Scanner;

public class Question24 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter a number : ");
        int number = sc.nextInt();

        int n=number;
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n=n/10;
        }

         System.out.print("\nSum of digits of "+number+" is = "+sum+"\n");

        sc.close();
    }
}
