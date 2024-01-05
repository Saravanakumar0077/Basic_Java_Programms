import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int h = input.nextInt();
        int Triangle = (b*h)/2;
        System.out.println("Area of Triangle is : " + Triangle);
    }
}
