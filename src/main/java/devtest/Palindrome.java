package devtest;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        String tempStr = str.toString();
        tempStr = tempStr.toLowerCase().trim();

        int left=0;
        int right=tempStr.length()-1;


        while (left<right){
            while(tempStr.charAt(left) == ' ') {left++;}
            while(tempStr.charAt(right) == ' ') {right--;}

            if (tempStr.charAt(left) != tempStr.charAt(right)){
                return false;
            }
            else{
                right--;
                left++;
            }
        }

            return true;
        }
}