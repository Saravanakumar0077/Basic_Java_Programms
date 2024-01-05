import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the No of subject : ");
        int n = input.nextInt();
        int sum = 0;
        float avg;
        for (int i=1;i<=n;i++){
            System.out.print("Enter the subject marks : ");
            int num = input.nextInt();
            sum+=num;
        } avg=(sum/n);
        System.out.println("Your Average Mark is " + avg);
    }
}
