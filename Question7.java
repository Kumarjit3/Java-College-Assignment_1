
class parent
{
    public void show()
    {
        System.out.print("\nShow in parent\n");
    }
}

class child extends parent
{
    public void show()
    {
        System.out.print("\nShow in child\n");
    }
}


public class Question7 
{
    public static void main(String[] args) 
    {
        parent p2 = new child();
        p2.show();
    }
}
