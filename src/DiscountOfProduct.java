import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Product Name : ");
        String Name = input.nextLine(); //Input name of the product
        System.out.print("Enter your product prize : ");
        int product = input.nextInt(); //Price of the product
        System.out.print("Enter your product discounts : ");
        int discount = input.nextInt(); //input of the discount in percentage
       // float counter = (100-discount); //Formula
        float counter = (discount*product)/100;
        float bill = (product-counter);
        System.out.println("Your product of "+ Name + " bill is " + bill);

    }
}
