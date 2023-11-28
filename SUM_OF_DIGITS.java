import java.util.Scanner;

public class SUM_OF_DIGITS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();
        int sum= 0 ;

        while (n!= 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("The sum of digit is"+sum);
    }
}
