import java.util.Scanner;

interface Row
{
   int row=3;
}


interface Column
{
   int column=3;
}

class Matrix implements Row,Column
{
   Scanner sc = new Scanner(System.in);
   int mrr[][] = new int[row][column];

   public void setMatrix()
   {
      System.out.print("\n\n");
      for(int i=0; i<row; i++)
      {
         for(int j=0; j<column; j++)
         {
            System.out.print("\n mrr["+i+"]["+j+"] = ");
            mrr[i][j] = sc.nextInt();
         }
      }
      System.out.print("\n\n\n");
   }

   public void showMatrix()
   {
      System.out.print("\n\n");
      for(int i=0; i<row; i++)
      {
         for(int j=0; j<column; j++)
         {
             System.out.print(" "+mrr[i][j]+" ");
         }
         System.out.print("\n");
      } 
       System.out.print("\n\n\n");
   }
   
}


public class Question11
{
   public static void main(String[] args)
   {
       Matrix m1 = new Matrix();
       m1.showMatrix();
       m1.setMatrix();
       m1.showMatrix();
   }
}