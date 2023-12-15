import java.util.Scanner;

public class Question28
{
    
     public static void main(String[] args)
     {
       Scanner sc = new Scanner(System.in);
       int r1=3,c1=3;
       int [][]arr = new int[r1][c1];
  
       System.out.print("\nEnter "+r1*c1+" array elements of(A) : \n");
       for(int i=0; i<r1; i++)
       {
          for(int j=0; j<c1; j++)
          {
             arr[i][j] = sc.nextInt();
          }
       }

       int r2=3,c2=4;
       int [][]brr = new int[r2][c2];
       System.out.print("\nEnter "+r2*c2+" array elements of(B) : \n");
       for(int i=0; i<r2; i++)
       {
          for(int j=0; j<c2; j++)
          {
             brr[i][j] = sc.nextInt();
          }
       }

       System.out.print("\n"+r1*c1+" array elements of(A) : \n");
       for(int i=0; i<r1; i++)
       {
          for(int j=0; j<c1; j++)
          {
             System.out.print(" "+arr[i][j]);
          }
            System.out.print("\n");
       }

       System.out.print("\n"+r2*c2+" array elements of(B) : \n");
       for(int i=0; i<r2; i++)
       {
          for(int j=0; j<c2; j++)
          {
             System.out.print(" "+brr[i][j]);
          }
            System.out.print("\n");
       }

       int [][]crr = new int[3][4];

       
        for(int i=0; i<r1; i++)
        {
          for(int j=0; j<c2; j++)
          {
             int mul=0;
             for(int k=0; k<c1; k++)
             {
                mul+=arr[i][k]*brr[k][j];
             }
              crr[i][j] = mul;
          }
            System.out.print("\n");
        }

      System.out.print("\nA * B : \n");
       for(int i=0; i<r2; i++)
       {
          for(int j=0; j<c2; j++)
          {
             System.out.print(" "+crr[i][j]);
          }
            System.out.print("\n");
       }
       sc.close();  
  }
}