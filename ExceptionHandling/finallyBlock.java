package ExceptionHandling;

import java.util.Scanner;

public class finallyBlock {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num1 = scanner.nextInt();
            int result = 100/num1;
            System.out.println(result);

        }
        catch (ArithmeticException e){
            System.out.println("You can't divide by zero");
        }
        finally {
            System.out.println("\nDivison is completed");
        }
    }
}
