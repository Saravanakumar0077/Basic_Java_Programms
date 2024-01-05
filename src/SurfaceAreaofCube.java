import java.util.Scanner;

public class SurfaceAreaofCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double areaofCube = (6 * (a * a));
        System.out.println("The Surface Area of Cube is : " + areaofCube);
    }
}
