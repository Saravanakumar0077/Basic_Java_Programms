import java.util.Scanner;

public class VolumeofCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int h = input.nextInt();
        double cone = (3.1459*r*r*h)/3;
        System.out.println("The Volume of Cone is : " + cone);
    }
}
