import java.util.Scanner;
public class Question03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word = input.next(); // Here is the input for a word
        System.out.println("enter a character: ");
        char c = input.next().charAt(0); //Here is the input for the character that you want count in the word
        int count = count(word, c); // Here we call the function
        System.out.printf("%d occurrences of %c in '%s'", count, c, word);
    }

    public static int count(String str, char a) {
        if (str.length() == 0) {  //Here if the input of the word is empty then it will not print anything
            return 0;
        }
        int count = 0;
        if (str.charAt(0) == a) { // Here if it is found then it will take the number of this and put it in count and
            // go to the second letter and so on until the end of the word
            count++;
        }
        return count + count(str.substring(1), a);
    }
}
