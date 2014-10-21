package devtest;

import java.util.ArrayList;

public class Palindrome {

    // TODO - Complete this method
    public static boolean isPalindrome(String str)
    {

        /*ArrayList check = new ArrayList();
        check.add('a');
        check.add('b');
        System.out.println("check size is = " +check.size());*/

       String lowerStr = str.toLowerCase();
       ArrayList newStr = new ArrayList();
       newStr = NoSpaceStr (lowerStr);

      // System.out.println(newStr);

       int begin = 0;
       int end = newStr.size()-1;

       while (begin < end){
           if (newStr.get(begin) != newStr.get(end)){
               return false;
           }
           if (begin+1 == end && newStr.get(begin) != newStr.get(end) ){
               return true;
           }
           begin++;
           end--;
       }

        return true;
    }

    protected  static ArrayList NoSpaceStr(String str){

        ArrayList NoSpaceStr = new ArrayList();
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) != ' ' ){
                NoSpaceStr.add(str.charAt(i));
            }
        }
        return NoSpaceStr;
    }


}