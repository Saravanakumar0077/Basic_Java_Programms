import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        for(int i=0;i<=n;i++){
            System.out.println(first);
//            if(first ==5){
//                break;
//            }
            int third = first + second;
            first = second;
            second = third;
        }
    }
}
