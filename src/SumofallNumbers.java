import java.util.Scanner;

public class SumofallNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n;
        long large = 0;
        do {
            System.out.println("Enter a number : ");
            n = input.nextLong();
            large+=n;

        } while (n!=0);
        System.out.println(large);

    }
}
