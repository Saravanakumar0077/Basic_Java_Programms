import java.io.PrintStream;
import java.util.Scanner;

public class Volumeofpyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int B = input.nextInt();
        int H = input.nextInt();
        double Pyramid = (B*H)/3;
        System.out.println("The Volume of Pyramid is : " + Pyramid);
    }
}
