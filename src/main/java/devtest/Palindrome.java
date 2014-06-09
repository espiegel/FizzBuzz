package devtest;
import java.lang.String;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        String strNsp = str.replaceAll("\\s","");
        for(int i=0; i < strNsp.length()/2;i++)
        {

            String comp1 = Character.toString(strNsp.charAt(i));
            String comp2 = Character.toString(strNsp.charAt(strNsp.length()-1-i));
            if (!comp1.equalsIgnoreCase(comp2))
            {
                return false;
            }
        }

        return true;
    }
}