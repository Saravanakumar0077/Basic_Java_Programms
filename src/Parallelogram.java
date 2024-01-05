import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int height = input.nextInt();
        double AreaofPrallelogram = (base * height);
        System.out.println("Area of Parallelogram is : " + AreaofPrallelogram);
    }
}
