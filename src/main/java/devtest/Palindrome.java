package devtest;

import java.time.Clock;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        String pali = str.replaceAll(" ","");

        pali = pali.toLowerCase();

        return isPalinIter(pali);
    }
    public static boolean isPalinIter(String str){
        int i, j=str.length()-1;
        Boolean ret = null;
        for (i=0;i<str.length();i++){
            if (i==j || i>j) {
                ret= true;
                break;
            }
            else if (str.charAt(i)!=str.charAt(j)) {
                ret = false;
                break;

            }
            else
                j--;
        }
        return ret;
    }
    public static boolean isPalin(String str){
        if (str.length()==0 || str.length()==1)
            return true;
        if (str.charAt(0)!= str.charAt(str.length()-1))
            return false;
        else
            return isPalin(str.substring(1,str.length()-1));
    }
}