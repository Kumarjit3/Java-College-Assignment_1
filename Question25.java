
class Mister implements Runnable
{
   public void run()
   {
       for(int i=0; i<1000; i++)
       {
          System.out.print("\nHello from Mister...........\n");
          try
          {
             Thread.sleep(3);
          }catch(InterruptedException e){ }
       }
   }
}

class Misses implements Runnable
{
   public void run()
   {
       for(int i=0; i<1000; i++)
       {
          System.out.print("\nHi from Misses...........\n");
           try
          {
             Thread.sleep(3);
          }catch(InterruptedException e){ }
        }
   }
}

public class Question25 
{
    public static void main(String[] args)
    {
          Mister m1 = new Mister();
          Misses m2 = new Misses();

          Thread t1 = new Thread(m1);
          Thread t2 = new Thread(m2);

          t1.start();
          try
          {
             Thread.sleep(3);
          }catch(InterruptedException e){ }
          t2.start();
    }
}
