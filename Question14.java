class Value
{
   private int A;
   private int B;
   private int C;

   public Value()
   {
       A = B = C = 0;
   }

   public Value(int A,int B,int C)
   {
       this.A = A;
       this.B = B;
       this.C = C;
   }

   public Value(int A)
   {
      this();     //calling default constructor of this class 
      this.A = A;
   }

   public Value(int A,int B)
   {
      this();     //calling default constructor of this class 
      this.A = A;
      this.B = B;
   }

   public void sum()
   {
       int result = (this.A+this.B+this.C);
       System.out.print("\n\nSum of ["+this.A+" + "+this.B+" + "+this.C+"] = "+result+"\n");
   }
}

public class Question14
{
    public static void main(String[] args)
    {
        Value v1 = new Value();
        Value v2 = new Value(3);
        Value v3 = new Value(3,9);
        Value v4 = new Value(3,6,9);
        
        v1.sum();
        v2.sum();
        v3.sum();
        v4.sum();

    }
}