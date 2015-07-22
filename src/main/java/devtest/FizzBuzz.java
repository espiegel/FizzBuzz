package devtest;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String toString() {
        if(this.number <= 0){
            return "Undefined";
        }
        else if(this.number % 5 == 0 && this.number % 3 == 0){
            return "FizzBuzz";
        }
        else if(this.number % 3 == 0){
            return "Fizz";
        }
        else if (this.number % 5 == 0){
            return "Buzz";
        }
        else return this.number+"";

    }
}
