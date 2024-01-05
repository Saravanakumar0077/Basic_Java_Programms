import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int result = 0;
        while (num>0){
            int rem = (num%10);
            num/=10; // <-- Doubt
            result = (result * 10) + rem;
        }
        System.out.println(result);
    }
}
