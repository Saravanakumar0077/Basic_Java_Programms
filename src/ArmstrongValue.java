import java.util.Scanner;

public class ArmstrongValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no  = input.nextInt();
        int no2 = no;
        int arm = 0;
        do {
            int rem = (no%10);
            arm = arm +(rem * rem * rem);
            no = no/10;
        } while (no > 0);

        if(no2 == arm){
            System.out.println("The correct Armstrong value is : " + arm);
        } else {
            System.out.println(" It is not a Armstrong value ");
        }

    }
}
