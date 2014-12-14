package devtest;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String toString() {
        String res = "";
        if ( number <= 0 ) {
            return "Undefined";
        }

        if ( number % 3 == 0 ) {
            res += "Fizz";
        }
        if ( number % 5 == 0 ) {
            res += "Buzz";
        }
        if ( res.equals( "" ) ) {
            return Integer.toString(number);
        }
        return res;
    }
}
