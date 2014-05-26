import devtest.Palindrome;
import junit.framework.TestCase;

/**
 * Created by eidan on 5/11/14.
 */
public class PalindromeTest extends TestCase {

    public void testString1() {
        assertEquals(Palindrome.isPalindrome("abab"), false);
    }

    public void testString2() {
        assertEquals(Palindrome.isPalindrome("abba"), true);
    }

    public void testString3() {
        assertEquals(Palindrome.isPalindrome("aaa"), true);
    }

    public void testString4() {
        assertEquals(Palindrome.isPalindrome("abccba"), true);
    }

    public void testString5() {
        assertEquals(Palindrome.isPalindrome("abcbca"), false);
    }

    public void testString6() {
        assertEquals(Palindrome.isPalindrome("ababab"), false);
    }

    public void testString7() {
        assertEquals(Palindrome.isPalindrome("abcdefggfedcbb"), false);
    }

    public void testString8() {
        assertEquals(Palindrome.isPalindrome("abcdefggfedcba"), true);
    }

    public void testString9() {
        assertEquals(Palindrome.isPalindrome("abcdefghgfedcba"), true);
    }

    public void testString10() {
        assertEquals(Palindrome.isPalindrome("abcdefghygfedcba"), false);
    }
}
