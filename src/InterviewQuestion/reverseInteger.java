package InterviewQuestion;

public class reverseInteger {
    public static void main(String[] args) {

        /*
        Your task is to design an efficient algorithm to reverse a given integer.
        For example if the input of the algorithm is 1234 then the output should be 4321.
        NOTE: the input is an integer (and not a string) !!!
         */

        int number = 1234;

        System.out.println(reverseInt(number));

    }

    /*
        We are after the last digit in every iteration
        We can get it with the modulo operator:
        The last digit is the remainder when dividing by 10
        We have to make sure we remove that digit from the original number
        So we just have to divide the original number by 10
   */
    public static int reverseInt(int num) {

        int reversed = 0;
        int remainder = 0;

        while (num > 0) {
            remainder = num % 10;
            num = num / 10;
            reversed = reversed * 10 + remainder;
        }
        return reversed;
    }
}
