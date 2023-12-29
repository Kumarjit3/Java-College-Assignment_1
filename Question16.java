import java.util.Scanner;

public class Question16
{

     public static boolean isPrime(int num)
     {
        int i=0,count=0;
        while(++i<=num)
        {
           if(num % i == 0)
           {
             count++;
           }
        }
         if(count == 2)
         return true;
         else
         return false;
     }     

     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n\nEnter a positive integer : ");
        int number = sc.nextInt();
        
        if(isPrime(number))
        {
          System.out.print("\n\nThe number "+number+" is a prime number\n\n\n");
        }
        else
        {
          System.out.print("\n\nThe number "+number+" is a non-prime number\n\n\n");
        }

        sc.close();
     }
}