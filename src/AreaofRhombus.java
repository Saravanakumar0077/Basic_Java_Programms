import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        double rhombus = (d1 * d2)/2;
        System.out.println("Area of Rhombus is : " + rhombus);
    }
}
