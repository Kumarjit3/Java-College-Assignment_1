import java.util.Scanner;


class MatrixMultiplication
{
    private int row;
    private int column;
    int[][] mat;
    Scanner sc = new Scanner(System.in);

    public void CreateMatrix(int row,int column)
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

   
    public MatrixMultiplication matrixMultiplication(MatrixMultiplication m)
    {
       MatrixMultiplication mrr = new MatrixMultiplication();
       mrr.CreateMatrix(this.row,m.column);
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
             mrr.mat[i][j]=sum;
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

      MatrixMultiplication m1 = new MatrixMultiplication();
      System.out.print("\n\nEnter total number of row of the first matrix : ");
      int r1 = sc.nextInt();
      System.out.print("\n\nEnter total number of column of the first matrix : ");
      int c1 = sc.nextInt();
      System.out.print("\nEnter the "+r1*c1+" values of the first matrix : \n");
      m1.CreateMatrix(r1,c1);
      m1.setMatrix();
     
      MatrixMultiplication m2 = new MatrixMultiplication();
      System.out.print("\n\nEnter total number of row of the second matrix : ");
      int r2 = sc.nextInt();
      System.out.print("\n\nEnter total number of column of the second matrix : ");
      int c2 = sc.nextInt();
      System.out.print("\nEnter the "+r2*c2+" values of the second matrix : \n");
      m2.CreateMatrix(r2,c2);
      m2.setMatrix();
      
      System.out.print("\nThe "+r1*c1+" values of the first matrix are : \n");
      m1.showMatrix();
      System.out.print("\nThe "+r2*c2+" values of the second matrix are : \n");
      m2.showMatrix();
      
      MatrixMultiplication mm = m1.matrixMultiplication(m2);
      System.out.print("\nMatrix multiplication result is : \n");
      mm.showMatrix();
      System.out.print("\n\n\n");
      sc.close();
   }
}