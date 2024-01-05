import java.util.Scanner;

public class AdditionofNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number1 :");
        int a = input.nextInt();
        System.out.print("Enter a Number2 :");
        int b = input.nextInt();
        int c = (a+b);
        System.out.println("The Addition of two number is : " + c);

    }
}
