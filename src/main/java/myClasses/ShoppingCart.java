package myClasses;

import java.util.ArrayList;
import java.util.List;

/**
 * The ShoppingCart class represents a shopping cart that can hold pieces and motorcycles.
 * It provides methods to add and remove pieces and motorcycles from the cart, as well as to view the contents of the cart.
 */
public class ShoppingCart {

    static List<Pieces> myPieces = new ArrayList<Pieces>(); // List to hold pieces in the cart
    static List<Motorcycle> myBikes = new ArrayList<Motorcycle>(); // List to hold motorcycles in the cart

    /**
     * Adds a piece to the shopping cart.
     *
     * @param pieces The piece to add to the cart.
     * @return true if the piece is successfully added to the cart, false otherwise.
     */
    public static boolean AddOnePiece(Pieces pieces) {
        myPieces.add(pieces);
        return true;
    }

    /**
     * Adds a motorcycle to the shopping cart.
     *
     * @param motorcycle The motorcycle to add to the cart.
     * @return true if the motorcycle is successfully added to the cart, false otherwise.
     */
    public static boolean AddOneMoto(Motorcycle motorcycle) {
        myBikes.add(motorcycle);
        return true;
    }

    /**
     * Removes a piece from the shopping cart.
     *
     * @param pieces The piece to remove from the cart.
     * @return true if the piece is successfully removed from the cart, false otherwise.
     */
    public static boolean RemoveOnePiece(Pieces pieces) {
        myPieces.remove(pieces);
        return true;
    }

    /**
     * Removes a motorcycle from the shopping cart.
     *
     * @param motorcycle The motorcycle to remove from the cart.
     * @return true if the motorcycle is successfully removed from the cart, false otherwise.
     */
    public static boolean RemoveOneMoto(Motorcycle motorcycle) {
        myBikes.remove(motorcycle);
        return true;
    }

    /**
     * Displays all items in the shopping cart.
     * Prints out all motorcycles and pieces currently in the cart.
     */
    public void SeeAll() {
        System.out.println("My bikes:");
        for (Motorcycle myBike : myBikes) {
            System.out.println(myBike);
        }
        System.out.println("My pieces");
        for (Pieces myPiece : myPieces) {
            System.out.println(myPiece);
        }
    }
}
