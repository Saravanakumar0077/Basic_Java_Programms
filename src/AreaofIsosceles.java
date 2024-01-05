import java.util.Scanner;

public class AreaofIsosceles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int b = input.nextInt();
        int h = input.nextInt();
        double isosceles = (l*b*h)/2;
        System.out.println("Area of Isosceles is : " + isosceles);
    }
}
