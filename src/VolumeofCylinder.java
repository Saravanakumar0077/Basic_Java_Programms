import java.util.Scanner;

public class VolumeofCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int h = input.nextInt();
        double cylinder = (3.1459)*(r*r)*h;
        System.out.println("The Volume of Cylinder is : " + cylinder);
    }
}
