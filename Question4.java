public class Question4 
{
    public static void main(String[] args)
    {
        int k=1;
        System.out.print("\n\n");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                if(j<=i)
                {
                    System.out.print("     "+k++);
                }
            }
             System.out.print("\n");
        }
        System.out.print("\n\n\n");
    }
}
