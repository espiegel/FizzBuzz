package devtest;

import java.util.Locale;

public class Palindrome {

    public static boolean isPalindrome(String str) {

        if(str == null) // empty string is a palindrome?
            return true;
        String str_tmp = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        while( i < j){
            char ii = str_tmp.charAt(i);
            char jj = str_tmp.charAt(j);
            if(ii == ' '){
                i++;
                continue;
            }
            if(jj == ' '){
                j--;
                continue;
            }
            if(ii != jj)
                return false;
            i++;
            j--;
        }
        return true;
    }
}