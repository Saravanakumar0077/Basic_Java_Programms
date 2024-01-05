import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "ramar";
        String word2 = "";
        for (int i = word.length()-1;i>=0;i--){
            word2 = word2 + word.charAt(i);
        }
        System.out.println(word2);
        if(word.equals(word2)){
            System.out.println( word2 + " is Palindrome string");
        } else {
            System.out.println( word2 + " is not a palindrome");
        }
    }
}
