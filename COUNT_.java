import java.util.Scanner;

public class COUNT_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String name = sc.next().toLowerCase();

        int name_len = name.length();
        int count_consonant = 0;
        int count_vowel = 0;
        for (int i = 0; i < name_len; i++) {
            char n = name.charAt(i);
            if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u') {
                count_vowel = count_vowel+1;
            }
            else {
                count_consonant = count_consonant+1;
            }
        }
        System.out.println("Total number of Vowel = "+count_vowel);
        System.out.println("Total number of Consonant = "+count_consonant);
    }
}