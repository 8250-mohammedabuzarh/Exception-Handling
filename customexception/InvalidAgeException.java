package customexception;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class CustomException {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("\nYou are not eligible");
        } else {
            System.out.println("You are eligible");
        }
    }
    public static void main(String[] args) {

        try {
            validateAge(15);
        }
        catch (InvalidAgeException e) {
            System.out.println(e);
        }
        System.out.println("\nValidation completed");
    }
}