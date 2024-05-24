package myClasses;

import java.util.Objects;

/**
 * The UserLogin class represents a user login with a name and password.
 * It provides methods to check if the provided name and password match the stored credentials and to perform a login operation.
 */
public class UserLogin {
    static String name; // The name of the user
    String password; // The password associated with the user

    /**
     * Constructs a new UserLogin object with the specified name and password.
     *
     * @param name     The name of the user.
     * @param password The password associated with the user.
     */
    public UserLogin(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * Retrieves the name of the user.
     *
     * @return The name of the user.
     */
    public static String getName() {
        return name;
    }

    /**
     * Sets the name of the user.
     *
     * @param name The name to set.
     */
    public static void setName(String name) {
        UserLogin.name = name;
    }

    /**
     * Retrieves the password associated with the user.
     *
     * @return The password associated with the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password associated with the user.
     *
     * @param password The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Checks if the provided name and password match the stored credentials.
     *
     * @param name     The name to check.
     * @param password The password to check.
     * @return true if the provided name and password match the stored credentials, false otherwise.
     */
    public boolean Correct(String name, String password) {
        return Objects.equals(this.name, name) && Objects.equals(this.password, password);
    }

    /**
     * Performs a login operation using the provided name and password.
     * Prints "Login successful" if the provided credentials are correct, otherwise prints "Login failed".
     *
     * @param name     The name to login.
     * @param password The password to login.
     */
    public void Login(String name, String password) {
        if (Correct(name, password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}
