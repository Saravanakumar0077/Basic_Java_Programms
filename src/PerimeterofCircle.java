import java.util.Scanner;

public class PerimeterofCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        double perimeter = (2 * 3.1459 * R);
        System.out.println("The Area of Perimeter of Circle is : " + perimeter);
    }
}
