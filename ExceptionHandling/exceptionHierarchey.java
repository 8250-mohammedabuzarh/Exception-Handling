package ExceptionHandling;

import java.util.Scanner;

public class exceptionHierarchey {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scanner.nextInt();
            int result = num2/num1;
            System.out.println(result);
            String str = null;
            System.out.println(str.length());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception");
        }catch (NullPointerException e) {
            System.out.println("Null values are not allowed");
        }
        catch (Exception e){
            System.out.println("Parent exception");
        }

    }
}
