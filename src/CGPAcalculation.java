import java.util.Scanner;

public class CGPAcalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of subject : ");
        int n = input.nextInt();
        float sum=0;
        float cgpa;
        for(int i=1;i<=n;i++){
            System.out.print("Enter subject grade : ");
            float sub = input.nextFloat();
            sum+=sub;
        }
        cgpa = (sum/n);
        System.out.println("Your Overall CGPA is : " + cgpa);

















    }
}
