import java.util.Scanner;

public class Question3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the starting range : "); 
        int start = sc.nextInt();
        System.out.print("\nEnter the ending range : ");
        int end = sc.nextInt();
        int count=0;

        while(start<=end)
        {
           int j=1;
           while(j<=start)
            {
               if(start%j == 0)
               {
                  count++;
               }
               j++;
            }
            if(count == 2)
            {
                System.out.print("\nThe number "+start+" is prime\n");
            }
            else
            {
                System.out.print("\nThe number "+start+" is non prime\n");
            }
            count=0;
            start++;
        }
 
        
        sc.close();
    }
}
