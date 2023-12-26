import java.util.Scanner;


class MatrixMultiplication
{
    public int row;
    public int column;
    int[][] mat = new int[row][column];
    Scanner sc = new Scanner(System.in);

    public MatrixMultiplication(int row,int column)
    {
       this.row = row;
       this.column = column;
       mat = new int[row][column];
    }

    public void setMatrix()
    {
       System.out.print("\n\n");
       for(int i=0; i<this.row; i++)
       {
          for(int j=0; j<this.column; j++)
          {
              System.out.print("\n mat["+i+"]["+j+"] : ");
              mat[i][j] = sc.nextInt();
          }
       }
       System.out.print("\n\n");
    }

    public void showMatrix()
    {
       System.out.print("\n\n");
       for(int i=0; i<this.row; i++)
       {
          for(int j=0; j<this.column; j++)
          {
             System.out.print(" "+this.mat[i][j]+" ");
          }
           System.out.print("\n");
       }
    }

   
    public int[][] matrixMultiplication(MatrixMultiplication m)
    {
       int[][] mrr = new int[this.row][m.column];
       System.out.print("\n\n");
       for(int i=0; i<this.row; i++)
       {
          for(int j=0; j<m.column; j++)
          {
             int sum=0;
             for(int k=0; k<m.row; k++)
             {
                sum+=this.mat[i][k]*m.mat[k][j]; 
             }
             mrr[i][j]=sum;
          }
       }
        return mrr;
    }
 

}

public class Question13
{  
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("\n\nEnter total number of row of the first matrix : ");
      int r1 = sc.nextInt();
      System.out.print("\n\nEnter total number of column of the first matrix : ");
      int c1 = sc.nextInt();
      System.out.print("\n\nEnter total number of row of the second matrix : ");
      int r2 = sc.nextInt();
      System.out.print("\n\nEnter total number of column of the second matrix : ");
      int c2 = sc.nextInt();
      MatrixMultiplication m1 = new MatrixMultiplication(r1,c1);
      MatrixMultiplication m2 = new MatrixMultiplication(r2,c2);

      m1.setMatrix();
      m1.showMatrix();
      m2.setMatrix();
      m2.showMatrix();
      int[][] mm = m1.matrixMultiplication(m2);

      System.out.print("\nAfter matrix multiplication the matrix looks like : \n");
      for(int i=0; i<m1.row; i++)
      {
         for(int j=0; j<m2.column; j++)
         {
            System.out.print(" "+mm[i][j]+" ");
         }
           System.out.print("\n");
      }
        System.out.print("\n\n\n");
        sc.close();
   }
}