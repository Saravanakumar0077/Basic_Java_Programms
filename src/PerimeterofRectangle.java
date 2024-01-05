import java.util.Scanner;

public class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int w = input.nextInt();
        double rectangle = 2*(l+w);
        System.out.println("The Perimeter of Rectangle is : " + rectangle);
    }
}
