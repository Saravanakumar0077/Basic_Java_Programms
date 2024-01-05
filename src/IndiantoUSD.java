import java.util.Scanner;

public class IndiantoUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Indian Rupees : ");
        double indian = input.nextDouble();
        double result = (indian * 0.012020);
        System.out.println("The Indian Rupees convert to USD$ is : " + result + "$");



    }
}
