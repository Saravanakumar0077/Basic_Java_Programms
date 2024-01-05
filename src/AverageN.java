import java.util.Scanner;

public class AverageN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many number you want : ");
        int n = input.nextInt(); // How many number you want
        float sum = 0;
        float avg;
        for (int i=1;i<=n;i++) {
            int count= input.nextInt(); // User enter n times of input values
            sum+=count;
        }
        avg=(sum/n);
        System.out.println("The Average value of N : " + avg);

    }
}
