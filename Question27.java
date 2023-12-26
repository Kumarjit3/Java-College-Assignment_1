import java.util.Scanner;

public class Question27 
{

    public static int isVowel(char i)
    {
        if(i == 'a' || i == 'e' || i == 'i' || i ==  'o' || i ==  'u' || i ==  'A' || i ==  'E' || i ==  'I' || i ==  'O' || i ==  'U')
        {
            return 1;
        }
        else if(i == ' ')
        {
            return -1;
        }
        else
        {
            return 0;
        }
        
    }
     public static void main(String[] args)
     {
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string : ");
        s1 = sc.nextLine();
        int v=0,c=0;
        for(int i=0; i<s1.length(); i++)
        {
            if(isVowel(s1.charAt(i)) == 1)
            {
                //System.out.print("\n "+s1.charAt(i)+" is vowel");
                v++;
            }
            else if(isVowel(s1.charAt(i)) == 0)
            {
                //System.out.print("\n "+s1.charAt(i)+" is consonant");
                c++;
            }
            else
            {
                //System.out.print("\n "+s1.charAt(i)+" is space");
            }
        }

         System.out.print("\nIn this string we have total  : "+v+" vowels\n");
         System.out.print("\nIn this string we have total  : "+c+" consonants\n");

        sc.close();
     }
}
