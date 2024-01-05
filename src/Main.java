import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Even or Odd
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a%2==0){
            System.out.println("It is Even Number : " + a);
        } else {
            System.out.println("It is ODD Number : " + a);
        }
    }
}