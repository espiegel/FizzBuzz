package devtest;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String toString() {
        String res = "";
        if (this.number<=0)
        {
            return "Undefined";
        }
        if (this.number % 3 == 0)
        {
            res = "Fizz";
        }
        if(this.number % 5 == 0)
        {
            res += "Buzz";
        }
        if(res == "")
        {
            res = this.number + "";
        }
        return res;
    }
}
