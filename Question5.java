public class Question5 
{
    public static boolean isPalindrome(String str)
    {
        int j=0,count=0;
        for(int i=str.length()-1; i>=0; i--)
        {
            if(str.charAt(i) == str.charAt(j))
            {
                 count++;
            }
            j++;
        }
        if(count == str.length())
        return true;
        return false;
    }
    public static void main(String[] args) 
    {
        String s1 = "Kumarjit";

        System.out.println(isPalindrome(s1));
    }
}
