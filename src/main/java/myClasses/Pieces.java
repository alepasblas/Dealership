package myClasses;

import java.util.Scanner;

/**
 * The Pieces class represents individual pieces associated with a vehicle.
 * It provides methods to create a review for a piece and add the piece to a shopping cart.
 */
public class Pieces {
    String name; // Name of the piece
    double price; // Price of the piece
    String info; // Additional information about the piece

    /**
     * Constructs a new Pieces object with the specified parameters.
     *
     * @param name  The name of the piece.
     * @param price The price of the piece.
     * @param info  Additional information about the piece.
     */
    public Pieces(String name, double price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    /**
     * Retrieves the name of the piece.
     *
     * @return The name of the piece.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the piece.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the price of the piece.
     *
     * @return The price of the piece.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the piece.
     *
     * @param price The price to set.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Retrieves additional information about the piece.
     *
     * @return Additional information about the piece.
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets additional information about the piece.
     *
     * @param info The information to set.
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * Allows a user to create a review for the piece.
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
     * Adds the given piece to the shopping cart.
     *
     * @param pieces The piece to add to the cart.
     * @return true if the piece is successfully added to the cart, false otherwise.
     */
    public boolean AddToCart(Pieces pieces) {
        ShoppingCart.AddOnePiece(pieces);
        System.out.println("Piece added to the cart.");
        return true;
    }
}
