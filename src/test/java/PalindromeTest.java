import devtest.Palindrome;
import junit.framework.TestCase;

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

    public void testString11() {
        assertEquals(Palindrome.isPalindrome("A but tuba"), true);
    }

    public void testString12() {
        assertEquals(Palindrome.isPalindrome("A car a man a maraca"), true);
    }

    public void testString13() {
        assertEquals(Palindrome.isPalindrome("A dog A panic in a pagoda"), true);
    }

    public void testString14() {
        assertEquals(Palindrome.isPalindrome("A Santa at Nasa"), true);
    }
}
