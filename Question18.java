import java.util.Scanner;

class Multiply
{
    private int num1;
    private int num2;
    private int result;

    public Multiply()
    {
       num1 = 0;
       num2 = 0;
       result = 0;
    }

    public Multiply(int num1,int num2)
    {
       this();
       this.num1 = num1;
       this.num2 = num2;
       this.result = num1*num2;
    }

    public int getResult()
    {
        return this.result;
    }
}


public class Question18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("\nEnter the second number : ");
        int num2 = sc.nextInt();
        Multiply m1 = new Multiply(num1,num2);
        int result  = m1.getResult();
        System.out.print("\nMultiplication of "+num1+" x "+num2+" = "+result+"\n\n\n");
        sc.close();
    }
}