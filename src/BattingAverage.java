import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Total Runs : ");
        int totalruns = input.nextInt();
        System.out.print("Enter Total outs : ");
        int totalouts = input.nextInt();
        float avergae =(totalruns/totalouts);
        System.out.println("Your Batting Avergae is : " + avergae);

    }
}
