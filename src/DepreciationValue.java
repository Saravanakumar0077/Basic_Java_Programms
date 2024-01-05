import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Amount of your product : ");
        int amount = input.nextInt();
        System.out.print("Enter Depreciation of your product percentage : ");
        int percentage = input.nextInt();
        System.out.print("Enter No of year used : ");
        int years = input.nextInt();
        int bill;
        for(int i=0;i<years;i++){
            bill = (percentage*amount)/100;//This process repeat untill the year meet out
            amount-=bill;
        }
        System.out.println(amount);

    }
}
