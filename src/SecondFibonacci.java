import java.util.Scanner;
public class SecondFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int f = 0;
        int s = 1;
        for (int i=0;i<=n;i++){
            int t = (f+s);
            f = s;
            s = t;
            System.out.println(f);
        }
    }
}
