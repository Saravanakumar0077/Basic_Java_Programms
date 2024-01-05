import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Amount for Rent Home : ");
        int amount = input.nextInt();
        System.out.print("Enter your commission percentage : ");
        int percentage = input.nextInt();
        float commission = (percentage*amount)/100;
        System.out.println("Your Commission rate is " + commission);
    }
}
