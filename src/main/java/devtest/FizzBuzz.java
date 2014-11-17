package devtest;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String toString() {
        if (number <= 0)
            return "Undefined";
        if (number % 3 == 0) {
            if (number % 5 == 0)
                return "FizzBuzz";
            return "Fizz";
        }
        if (number % 5 == 0)
            return "Buzz";
        return String.valueOf(number);
    }
}
