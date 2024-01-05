import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Appliances voltage Consumes : ");
        int applianceVolt = input.nextInt();
        System.out.print("Enter your Estimated monthly use in hrs : ");
        int monthlyUse = input.nextInt();
        int watthrs = (applianceVolt * monthlyUse);
        System.out.println("Total watt hrs : " + watthrs);
        System.out.print("Kilowatt hrs is : ");
        int kilowatthrs = (watthrs / 1000);
        System.out.println("The Kilowatt hours of consumes : " + kilowatthrs);
        if(kilowatthrs<400){
             kilowatthrs*=5;
            System.out.println("Your Electricity bill is " + kilowatthrs);
        } else if (kilowatthrs<500){
            kilowatthrs*=3;
            System.out.println("Your Electricity bill is : " + kilowatthrs);
        } else if (kilowatthrs<1000) {
            kilowatthrs*=11;
            System.out.println("Your Electricity bill is : " + kilowatthrs);
        }





    }
}
