import java.util.Scanner;

public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ci, amount,rate,year; //p=amount, rate=r, year=y;
        System.out.print("Enter your Total Amount : ");
        amount = input.nextDouble();
        System.out.print("Enter your rate of intrest : ");
        rate = input.nextDouble();
        System.out.print("Enter no of year you deposite : ");
        year = input.nextDouble();
        ci = amount*Math.pow(1+(rate/100),year)-amount; //Math.pow used because of double value
        System.out.println("Your Compound Intrest is " + ci);


    }
}
