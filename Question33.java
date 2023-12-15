
class operation
{
   public void findArea(float f)
   {
      System.out.print("\nArea of the square is : "+f*f+"\n");
   }

   public void findArea(float a,float b)
   {
      System.out.print("\nArea of the rectangle is : "+a*b+"\n");
   }

   public void findArea(double s)
   {
      System.out.print("\nArea of the circle is : "+(3.14*s*s)+"\n");
   }
}

public class Question33 
{
    public static void main(String[] args) 
    {
        operation o1 = new operation();

        o1.findArea(10,22);
        o1.findArea(5.3f);
        o1.findArea(7.9);
        System.out.print("\n\n\n");
    }
}
