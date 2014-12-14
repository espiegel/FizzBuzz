package devtest;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        str = str.replace(" ", "");
        str = str.toLowerCase();
        int left = 0 , right = str.length() - 1 ;
        while ( left < right ) {
            if (str.charAt(left) != str.charAt(right) ) {
                return false;
            }
            left ++ ;
            right -- ;
        }
        return true;
    }
}