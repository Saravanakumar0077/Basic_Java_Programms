import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number is : ");
        int n = input.nextInt();
        long sum = 0;
        long res;
        for(int i=1;i<=n;i++){ //Sum of N number
            System.out.print("Enter the number : ");
            long user = input.nextLong();
            sum+=user;
        }
        res = sum;
        System.out.println("The Sum of N number is " + res);
    }
}
