package devtest;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String toString() {

        if (number <=0){
            return "Undefined";
        }

        else if (number%5 == 0 && number%3 ==0){
            return "FizzBuzz";
        }

        else if (number%5==0){
            return "Buzz";
        }

        else if (number%3==0){
            return "Fizz";
        }



        return Integer.toString(number);
    }
}
