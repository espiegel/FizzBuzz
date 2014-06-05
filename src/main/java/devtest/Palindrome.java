package devtest;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        str = str.replace(" ","");
        int inx_start = 0;
        int inx_end = str.length();
        while ( inx_start < inx_end  ){
            String s1 = str.substring(inx_start,inx_start + 1);
            String s2 = str.substring(inx_end - 1, inx_end);
            if(s1.toUpperCase().compareTo(s2.toUpperCase()) != 0 ){
                return false;
            }
            inx_start ++;
            inx_end --;
        }
        return true;
    }
}