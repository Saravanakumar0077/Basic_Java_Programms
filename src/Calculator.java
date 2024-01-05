import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result;
        System.out.print("Enter a Number1 : ");
        double num1 = input.nextDouble();
        System.out.print("Enter a Number2 : ");
        double num2 = input.nextDouble();
        System.out.println("Enter a Operator type (+ , - , * , / , %) : ");
        char operator = input.next().charAt(0);

        if(operator == '+'){
            result = num1 + num2;
        }
        else if (operator == '-')
        {
            result = num1-num2;
        }
        else if (operator == '*')
        {
            result = num1 * num2;
        }
        else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            }
            else {
                System.out.println("Divisible by 0, is not valid ");
                return;
            }
        }
         else if (operator == '%') {
            result = num1 % num2;
        }
        else {
            System.out.println("Error, Invalid operator");
            return;
        }
        System.out.println("Result : " + result);
    }
}
