import java.util.Scanner;

public class DistanceBetweenTwoPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A distance from Home : ");
        int a = input.nextInt();
        System.out.print("Enter B distance from Home : ");
        int b = input.nextInt();
        int c = (a+b);
        System.out.println("The Distance between two point is : " + c + "Km");

    }
}
