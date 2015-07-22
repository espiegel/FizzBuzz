package devtest;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length()-1;

        while( i < str.length()/2){
                if(str.toLowerCase().charAt(i) == ' '){
                    i++;
                }
                if(str.toLowerCase().charAt(j) == ' '){
                    j--;
                }
            if(str.toLowerCase().charAt(i) != ' ' && str.toLowerCase().charAt(j) != ' ')
                if(str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j)) {
                    return false;
                }
                else {
                    j--;
                    i++;
                }
        }
        return true;
    }

}
