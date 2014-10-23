package devtest;

public class Palindrome {

    public static boolean isPalindrome(String strInput) {
        String str = dropSpaces(strInput);
        int lastIndex = (str.length())/2;
        int stringSize = str.length()-1;
        str = str.toLowerCase();
        for(int i =0 ; i<lastIndex ; ++i){
            if(str.charAt(i)!=str.charAt(stringSize-i)){
            return false;
            }
        }
        return true;
    }

    private static String dropSpaces(String s){
        String retVal = "";
        char[] inputString = s.toCharArray();
        int lastIndex = s.length();
        for(int i =0;i<lastIndex  ;++i){
            if(inputString[i]!=' '){
                retVal+=inputString[i];
            }
        }
        return retVal;
    }
}