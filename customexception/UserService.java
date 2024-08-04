package customexception;


import java.util.HashSet;
import java.util.Set;

class UserService {
    private Set<String> users = new HashSet<>();
    public void registerUser(String username) throws UserAlreadyExistsException {
        if (users.contains(username)) {
            throw new UserAlreadyExistsException("User already exists: " + username);
        }
        users.add(username);
        System.out.println("User registered successfully: " + username);
    }

    public void checkUserExistence(String username) throws UserNotFoundException {
        if (!users.contains(username)) {
            throw new UserNotFoundException("User not found: " + username);
        }
        System.out.println("User exists: " + username);
    }

    public static void main(String[] args) {
        UserService userService = new UserService();

        try {
            userService.registerUser("Abuzarh");
            userService.registerUser("Abuzarh"); // This will throw UserAlreadyExistsException
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            userService.checkUserExistence("Ajay"); // This will throw UserNotFoundException
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            userService.checkUserExistence("Abuzarh"); // This will not throw an exception
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
// Custom exceptions
class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}


