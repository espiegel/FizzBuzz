package devtest;

public class Palindrome {

    public static boolean isPalindromeAux(String str) {
        int len = str.length();
        if (len == 0 || len == 1)
            return true;
        return (str.charAt(0) == str.charAt(len - 1)) && isPalindrome(str.substring(1, len - 1));
    }

    public static boolean isPalindrome(String str) {
        String cleanStr = str.toLowerCase().replaceAll(" ", "");
        char letters[] = cleanStr.toCharArray();
        int len = letters.length;
        for (int i = 0, j = len - 1; i <= j; i++, j--) {
            if (letters[i] != letters[j])
                return false;
        }
        return true;
    }
}