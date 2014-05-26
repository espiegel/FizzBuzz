import junit.framework.TestCase;
import devtest.FizzBuzz;
/**
 * Created by eidan on 5/11/14.
 */


public class FizzBuzzTest extends TestCase {

    public void testInputOne() {
        FizzBuzz fizzbuzz = new FizzBuzz(1);
        assertEquals("1", fizzbuzz.toString());
    }

    public void testInputThree() {
        FizzBuzz fizzbuzz = new FizzBuzz(3);
        assertEquals("Fizz", fizzbuzz.toString());
    }

    public void testInputFive() {
        FizzBuzz fizzbuzz = new FizzBuzz(5);
        assertEquals("Buzz", fizzbuzz.toString());
    }

    public void testInputFifteen() {
        FizzBuzz fizzbuzz = new FizzBuzz(15);
        assertEquals("FizzBuzz", fizzbuzz.toString());
    }

    public void testInputOneHundredAndOne() {
        FizzBuzz fizzbuzz = new FizzBuzz(101);
        assertEquals("101", fizzbuzz.toString());
    }

    public void testInputNinetyNine() {
        FizzBuzz fizzbuzz = new FizzBuzz(99);
        assertEquals("Fizz", fizzbuzz.toString());
    }

    public void testInputOneHundred() {
        FizzBuzz fizzbuzz = new FizzBuzz(100);
        assertEquals("Buzz", fizzbuzz.toString());
    }

    public void testInputOneHundredAndFive() {
        FizzBuzz fizzbuzz = new FizzBuzz(105);
        assertEquals("FizzBuzz", fizzbuzz.toString());
    }

    public void testInputOneHundredSeventyTwo() {
        FizzBuzz fizzbuzz = new FizzBuzz(172);
        assertEquals("172", fizzbuzz.toString());
    }

}
