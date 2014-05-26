package devtest;

/**
 * Created by eidan on 5/11/14.
 */
public class Palindrome {

    public static boolean isPalindrome(String s) {
        /*
          Definition: A palindrome is a string that reads the same forward and backward.
          For example, "abcba" is a palindrome, "abab" is not.
          Please implement this method to
          return true if the parameter is a palindrome and false otherwise.
         */
        for(int i=0;i<=s.length()/2;i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length()-i-1);

            if(start != end) {
                return false;
            }
        }

        return true;
    }


}
