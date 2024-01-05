import java.util.Scanner;

public class PowerValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = input.nextInt(); //Power of the value
        int res = (n*n);
        System.out.println("The power value is : " + res);
    }
}
