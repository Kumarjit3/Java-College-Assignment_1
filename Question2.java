import java.util.Scanner;

public class Question2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number : ");
        int n = sc.nextInt();
        int m = n;
        long fact = 1;
        while(n!=1)
        {
           fact*=n; 
           n--;
        }

        System.out.print("\nThe factorial of "+m+" is => "+fact+"\n\n");
        sc.close();
    }
}
