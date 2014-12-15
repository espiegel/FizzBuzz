package devtest;

import com.sun.org.apache.xml.internal.security.algorithms.JCEMapper;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        String ret_str = str.toLowerCase().replaceAll(" ","");
        boolean flag = true;
        int i = 0; int j = ret_str.length() - 1 ;
        for(;i<=j; i++,j--) if (ret_str.charAt(i) != ret_str.charAt(j)) flag = false;
        return flag;
    }
}