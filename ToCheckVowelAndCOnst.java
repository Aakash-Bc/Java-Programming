import java.util.Scanner;

public class ToCheckVowelAndCOnst{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a letter: ");
        char letter = scanner.next().toLowerCase().charAt(0);


        if (!Character.isLetter(letter)) {
            System.out.println("Invalid input. Please enter a letter.");
        } else {

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        }

        scanner.close();
    }
}
