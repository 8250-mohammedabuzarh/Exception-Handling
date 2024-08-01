package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class multipleCatch {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scanner.nextInt();
            int result = num2/num1;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("You can't divide by zero");
        }
        catch (InputMismatchException e){
            System.out.println("Enter a Integer value only");
        }
    }
}
