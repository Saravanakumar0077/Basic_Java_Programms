import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) { // Rate of Intrest in your salary
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Salary : ");
        int salary = input.nextInt();
        System.out.print("Enter your Time : ");
        int time = input.nextInt();
        System.out.print("Enter your Rate : ");
        int rate = input.nextInt();

        int s = (salary*time*rate)/100;
        System.out.println("The Simple Intrest values of your salary : " + s);
    }
}
