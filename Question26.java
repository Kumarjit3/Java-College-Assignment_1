import java.util.Scanner;

class InvalidAgeException extends Exception
{
     public InvalidAgeException(String message)
     {
         super(message);
     } 
}

public class Question26 
{

    public static void isEligible(int age) throws InvalidAgeException
    {
         if(age<18)
        {
            throw new InvalidAgeException("\nAge is less then 18 ! you are not eligible to vote\n");
        }
        else
        {
            System.out.print("\nYou are eligible for vote\n");
        }
    }
    public static void main(String[] args) 
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your age for vote : ");
        age = sc.nextInt();

        try
        {
             isEligible(age);   
        }

        catch(InvalidAgeException e)
        {
            e.printStackTrace();
        }

        sc.close();
    }
}
