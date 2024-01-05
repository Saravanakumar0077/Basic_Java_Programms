import java.util.Scanner;

public class PerimeterofParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        double parallelogram = 2 * (a + b);
        System.out.println("The Area of Perimeter of Parallelogram is : " + parallelogram);
    }
}
