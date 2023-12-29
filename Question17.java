import java.util.Scanner;

public class Question17
{

     public static boolean isArmstrong(int num)
     {
        int sum=0,n=num,p=0;

        while(n!=0)
        {
          p++;
          n=n/10; 
        }        

         n = num;        

        while(n!=0)
        {
           int k = n%10;
           sum+=Math.pow(k,p);
           n=n/10;
        }
         if(sum == num)
         return true;
         else
         return false;
     }     

     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n\nEnter a positive integer : ");
        int number = sc.nextInt();
        
        if(isArmstrong(number))
        {
          System.out.print("\n\nThe number "+number+" is a armstrong number\n\n\n");
        }
        else
        {
          System.out.print("\n\nThe number "+number+" is not a armstrong number\n\n\n");
        }

        sc.close();
     }
}