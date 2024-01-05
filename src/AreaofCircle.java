import java.nio.channels.Pipe;
import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double areaofCircle =((3.1459) * (r*r)); //Area of Circle
        System.out.println("Area of Circle is : " + areaofCircle);
    }
}
