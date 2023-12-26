import java.util.Vector;

public class Question23 
{
    public static void main(String[] args) 
    {
        Vector<String> v1 = new Vector<>();

         for(int i=0; i<args.length; i++)
         {
            v1.add(args[i]);
         }
    
         System.out.print("\nVector list items are : "+v1+"\n\n");
    }
}
