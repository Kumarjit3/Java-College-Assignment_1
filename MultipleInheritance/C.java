package MultipleInheritance;

interface A
{
   public int x = 3;
   public void showA();
}

interface B
{
   public int y =6;
   public void showB();
}

public class C implements A,B
{
   public int z = 9;

   public void showA()
   {
      System.out.print("\nHello from class A\n"); 
   }

   public void showB()
   {
      System.out.print("\nHello from class B\n"); 
   }

   public void showC()
   {
      System.out.print("\nHello from class C\n");  
   }
}