package devtest;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    // TODO - Complete this method
    public String toString() {

        if (number < 0 || number == 0){ //not positive
            return "Undefined";
        }

        if (number % 5 == 0 && number % 3 == 0){
            return "FizzBuzz";
        }


        if (number % 3 == 0){
            return "Fizz";
        }

        if (number % 5 == 0){
            return "Buzz";
        }



        return (String.valueOf(number) );

    }
}
