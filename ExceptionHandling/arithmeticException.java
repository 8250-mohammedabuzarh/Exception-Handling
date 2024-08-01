package ExceptionHandling;

import java.util.Scanner;

public class arithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        try{
            int result = 100/num1;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("You can't divide by zero");
        }
    }
}
