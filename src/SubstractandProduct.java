import java.util.Scanner;

public class SubstractandProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int product = 1;
        int sum = 0;
        int result;
        while (n>0){
            product*= (n%10);
            sum+=(n%10);
            n/=10;
            result = (product-sum);
            System.out.println("The result is : " + result);
        }
    }
}
