package devtest;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        str = String.join("",str.split(" "));
        int len = str.length();
        String leftHalf;
        String rightHalf;
        if (len % 2 == 0) {
            leftHalf = str.substring(0,len/2);
            rightHalf = str.substring(len/2);
        }
        else {
            leftHalf = str.substring(0,len/2);
            rightHalf = str.substring(len/2+1);
        }
        rightHalf = new StringBuilder(rightHalf).reverse().toString();
        return rightHalf.equals(leftHalf);
    }

}