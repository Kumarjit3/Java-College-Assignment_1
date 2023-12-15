import multiplication.multiply;
import java.util.Scanner;

public class Question32
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      multiply m1 = new multiply();
      System.out.print("\n\nEnter any positive integer : "); 
      int n = sc.nextInt();
      System.out.print("\n\nMultiplication table of "+n+"\n\n");
      m1.MUL(n);
      sc.close();
      System.out.print("\n\n\n");
   }
}