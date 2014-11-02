package devtest;

public class Palindrome {

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase(); // Make old string lower-case
        char[] charArr = str.toCharArray(); // Make a comfortable to use char-array
        String nString = new String(); // make a new string for the palindrome
        String oldString = new String(); // makes a new string to put in the original string (minus spaces)

        for(int i = 0; i < str.length(); i++){
            if( str.charAt(i) != ' '){
                oldString += str.charAt(i); //Recreates old string without spaces
            }
        }

        for(int i=charArr.length-1; i >= 0 ; i--){
            //If 'space', ignore:
                if(charArr[i] != ' ')
                    nString += charArr[i]; // Creates new string without spaces, opposed direction of old string
        }

        if(nString.compareTo(oldString) == 0)
            return true; // Compares, is true?


        return false; // If not, false
    }

}