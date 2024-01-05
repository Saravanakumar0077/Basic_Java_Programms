import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if(name.equalsIgnoreCase("krishna") || name.equalsIgnoreCase("kala")){ //equalIgnoreCaes (Use to Identify the same string value)
            System.out.println("Welcome to our Home " + name);
        } else {
            System.out.println((name + " You have no invitation"));
        }
    }
}
