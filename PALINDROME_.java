import java.util.Scanner;

public class PALINDROME_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string");
        String i = input.nextLine();
        String rev = "";

        for (int p = i.length() - 1; p >= 0; p--) {
            rev += i.charAt(p);
        }
        if (i.equals(rev)){
            System.out.println("It is a Palindrome: "+rev);
        }
        else{
            System.out.println("It is not a palindrome: "+rev);
        }
    }
}