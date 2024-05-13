package myClasses;

import java.util.Scanner;

/**
 * The Vehicle class represents a generic vehicle.
 * It provides methods to access and modify information about the vehicle, as well as functionality related to reviews and cart management.
 */
public class Vehicle {
    String name; // The name of the vehicle
    String model; // The model of the vehicle
    String info; // Additional information about the vehicle
    double price; // The price of the vehicle

    /**
     * Constructs a new Vehicle object with the specified parameters.
     *
     * @param name   The name of the vehicle.
     * @param model  The model of the vehicle.
     * @param info   Additional information about the vehicle.
     * @param price  The price of the vehicle.
     */
    public Vehicle(String name, String model, String info, double price) {
        this.name = name;
        this.model = model;
        this.info = info;
        this.price = price;
    }

    /**
     * Retrieves the name of the vehicle.
     *
     * @return The name of the vehicle.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the vehicle.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the model of the vehicle.
     *
     * @return The model of the vehicle.
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the vehicle.
     *
     * @param model The model to set.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Retrieves additional information about the vehicle.
     *
     * @return Additional information about the vehicle.
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets additional information about the vehicle.
     *
     * @param info The information to set.
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * Retrieves the price of the vehicle.
     *
     * @return The price of the vehicle.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the vehicle.
     *
     * @param price The price to set.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Reads additional information about the vehicle from a text file.
     * This method is intended to be implemented to read information from a specific format of text file.
     */
    public void ReadInfoFromTxt() {
        // Implementation to read information from text file goes here
    }

    /**
     * Allows a user to create a review for the vehicle.
     * Prompts the user to input a review and star rating.
     */
    public void CreateAReview() {
        Scanner sc = new Scanner(System.in);

        // Prompting user for review input
        System.out.println("Introduce the review");
        String review = sc.nextLine();

        // Prompting user for star rating input
        System.out.println("Introduce the stars");
        int stars = sc.nextInt();

        // Creating a new Reviews object with provided inputs
        Reviews reviews = new Reviews(review, stars);
    }

    /**
     * Adds the vehicle to the shopping cart.
     * This method is intended to be overridden by subclasses to provide specific implementation.
     *
     * @return true if the vehicle is successfully added to the cart, false otherwise.
     */
    public boolean AddToCart() {
        System.out.println("Added to the cart");
        return true;
    }
}
