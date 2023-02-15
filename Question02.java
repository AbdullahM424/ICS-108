import java.util.Scanner;
public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your digits, please:");
        long n = input.nextLong();   //Here is the input and the type of it, it's long
        int sum = sumDigits(n);  // Here we call the function
        System.out.println("The sum is: " + sum);
    }// main

    public static int sumDigits(long n) {
        // Here we declare the variables
        int num = (int) (n);  // the "n" is long type and we convert to int type
        int sum = 0;

        while (num > 0) {

            sum += num % 10; // must mod - gives individual numbers
            num = num / 10; // must divide - gives new num

        }// loop
        return sum;
    }  // sumDigits
}
