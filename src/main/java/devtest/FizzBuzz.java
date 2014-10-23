package devtest;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }
    private static final String UNPOSITIVE_INPUT = "Undefined";
    private static final String DIVIDE_ONLY_BY_3 = "Fizz";
    private static final String DIVIDE_ONLY_BY_5 = "Buzz";
    private static final String DIVIDE_BY_3_AND_5 = "FizzBuzz";
    public String toString() {
        if(number<=0){
            return UNPOSITIVE_INPUT;
        }
        else if(number%15==0){
            return DIVIDE_BY_3_AND_5;
        }
        else if(number%3==0){
            return DIVIDE_ONLY_BY_3;
        }
        else if (number%5==0){
            return DIVIDE_ONLY_BY_5;
        }
        else{
            return String.format("%d",number);
        }

    }
}
