import java.util.Scanner;

public class CurvedSurfaceAreaofCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int h = input.nextInt();
        double surfaceAreaofCylinder = (2 * 3.1459 * r * h);
        System.out.println("The Curved surface Area of Clinder is : " + surfaceAreaofCylinder);

    }
}
