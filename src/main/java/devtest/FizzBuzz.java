package devtest;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String toString() {

        if (number <= 0) {
            return "Undefined";
        }
        else if (number % 15 == 0) {
            return "FizzBuzz";
        }
        else if (number % 3 == 0) {
            return "Fizz";
        }
        else if (number % 5 == 0) {
            return "Buzz";
        }

        return Integer.toString(number);
    }
}
