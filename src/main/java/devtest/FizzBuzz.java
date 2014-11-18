package devtest;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String toString() {
        String ret=null;
        if (number <1)
            ret = "Undefined";
        else if ((number % 3==0) && (number % 5==0))
            ret = "FizzBuzz";
        else if ((number % 3==0))
            ret = "Fizz";
        else if ((number % 5==0))
            ret = "Buzz";
        else
            ret = Integer.toString(number);

        return ret;

    }
}
