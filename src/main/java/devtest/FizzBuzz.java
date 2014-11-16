package devtest;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String toString() {
        boolean threediv = (this.number%3 == 0);
        boolean fivediv = (this.number%5 == 0);


        if (0>=this.number){
            return "Undefined";
        }
        else{

            if (threediv&&fivediv){
                return "FizzBuzz";
            }else if (threediv){
                return "Fizz";
            }else if (fivediv) {
                return "Buzz";
            }
        }

        return this.number+"";
    }
}
