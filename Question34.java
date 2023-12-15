public class Question34
{
    public static void main(String[] args)
    {
          int n = 5;
          int m = n/2;
          int l = m;
          int r = m;
          boolean flag;

          for(int i=0; i<n; i++)
          {
              if(i==0)
              {
                 flag = false; 
              }
             else if((i+1) % 2 == 0)
             {
                flag = true;
                l--;
             }
             else
             {
                flag = false;
                r++;
             }

             for(int j=0; j<n; j++)
             {
               if(i==0)
               {
                  if(j==n/2)
                  {
                    System.out.print(" *");
                  }
                  else
                  {
                    System.out.print("  ");
                  }
               }
               else if(flag)
                {
                   if(j >= l && j <= m)
                   {
                      System.out.print(" *");
                   }
                   else
                   {
                     System.out.print("  ");
                   }
                } 
                else
                {
                   if(j <= r && j >= m)
                   {
                      System.out.print(" *");
                   }
                   else
                   {
                     System.out.print("  ");
                   }
                }
             }
                   System.out.print("\n");
                             
          }
    }

}