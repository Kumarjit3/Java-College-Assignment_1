
class car 
{
    public void show1()
    {
        System.out.print("\nShow in car\n");
    }
}

class sportsCar extends car
{
    public void show2()
    {
        System.out.print("\nShow in SportsCar\n");
    }
}

public class Question6 
{
    public static void main(String[] args) 
    {
        sportsCar c1 = new sportsCar();

        c1.show1();
        c1.show2();
    }
}
