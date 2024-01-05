import java.util.Scanner;

public class VolumeofPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int h = input.nextInt();
        double prism = (b*h);
        System.out.println("The Volume of Prism is : " + prism);
    }
}
