import java.util.Scanner;

public class VolumeofSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        double sphere = ((4/3) * (3.1459) * (r*r*r));
        System.out.println("The Volume of Sphere is : " + sphere);
    }
}
