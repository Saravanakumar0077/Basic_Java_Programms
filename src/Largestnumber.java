import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a>b){
            System.out.println("The Largest Number is " + a );
        } else {
            System.out.println("The Largest Number is " + b);
        }
    }
}
