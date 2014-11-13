package devtest;

public class Palindrome {

    private static String converStrFormat(String str) {
        String str2 = str.toLowerCase();
        String str3 = str2.replace(" ","");
        if ( (str3.length() % 2) != 0) {
            return str3.substring(0, str3.length()/2) + str3.substring(str3.length()/2 + 1) ;
        }
        return str3;
    }

    public static boolean isPalindrome(String str) {
        String newStr = converStrFormat(str);

        //check palindrome
        int index = newStr.length() / 2;
        String strPart1 = newStr.substring(0,index);
        String strPart2 = newStr.substring(index);

        StringBuilder builder = new StringBuilder();
        builder.append(strPart2);
        builder.reverse();

        if (strPart1.equals (builder.toString())) {
            return true;
        }

        return false;
    }

}