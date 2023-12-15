import java.util.Scanner;
import java.util.ArrayList;

public class Question31
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     ArrayList<Integer> a1 = new ArrayList<>();

     System.out.print("\nEnter the how number of prime numbers you want to see : ");
     int n = sc.nextInt();

     int i=1,p=1,count=0; 
     while(i<=n)
     {
        int k=1;
        while(k<=p)
        {
          if(p%k == 0)
          {
            count++;
          }
           k++;
        }
          if(count==2)
          {
            a1.add(p);
            i++;
          }
           count=0;
           p++;           
     }
      System.out.print("\n");
      for(int a : a1)
      System.out.print(" "+a+" ,");
      System.out.print("\n");
  }
}