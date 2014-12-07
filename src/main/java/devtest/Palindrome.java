package devtest;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        String strLowerCase = str.toLowerCase();
        String[] strCut = strLowerCase.split(" ");
        int counter = 0;
        String newStr="";

        for (int i=0; i<strCut.length;i++){
            newStr += strCut[i];
        }


        //reverse String
        String reverseStr ="";
        for (int j=newStr.length()-1; j>=0;j--){
            reverseStr += newStr.charAt(j);
        }

        for (int k=0; k<newStr.length();k++){
            if (newStr.charAt(k)!=reverseStr.charAt(k)){
                return false;
            }

        }


        return true;
    }
}