import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double equilateral = (1.73 * a* a)/4;
        System.out.println("Area of the Equilateral Triangle is : " + equilateral);
    }
}
