import java.util.Scanner;

public class FactorsofNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        for (int i=1;i<=n;i++){ //How many number divide th n values is equal to zero is factors of numbers
            if(n%i == 0){ //n modulus i is equal to zero is th factors of numbers
                System.out.println(i);
            }
        }
    }
}
