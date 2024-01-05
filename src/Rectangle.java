import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int w = input.nextInt();

        double rectangle = (l*w);
        System.out.println("Area of Rectangle is : " + rectangle);
    }
}
