package myClasses;

/**
 * The Motorcycle class represents a type of vehicle that is a motorcycle.
 * It extends the Vehicle class and adds specific attributes and methods related to motorcycles.
 */
public class Motorcycle extends Vehicle {
    String specification; // Specification of the motorcycle
    Pieces pieces; // Pieces associated with the motorcycle

    /**
     * Constructs a new Motorcycle object with the specified parameters.
     *
     * @param name          The name of the motorcycle.
     * @param model         The model of the motorcycle.
     * @param info          Additional information about the motorcycle.
     * @param price         The price of the motorcycle.
     * @param specification The specification of the motorcycle.
     * @param pieces        The pieces associated with the motorcycle.
     */
    public Motorcycle(String name, String model, String info, double price, String specification, Pieces pieces) {
        super(name, model, info, price);
        this.specification = specification;
        this.pieces = pieces;
    }

    public Motorcycle(String name, String model, String info, double price, String specification) {
        super(name, model, info, price);
        this.specification = specification;
    }
    /**
     * Retrieves the specification of the motorcycle.
     *
     * @return The specification of the motorcycle.
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * Sets the specification of the motorcycle.
     *
     * @param specification The specification to set.
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }

    /**
     * Retrieves the pieces associated with the motorcycle.
     *
     * @return The pieces associated with the motorcycle.
     */
    public Pieces getPieces() {
        return pieces;
    }

    /**
     * Sets the pieces associated with the motorcycle.
     *
     * @param pieces The pieces to set.
     */
    public void setPieces(Pieces pieces) {
        this.pieces = pieces;
    }

    /**
     * Adds the given motorcycle to the shopping cart.
     *
     * @param motorcycle The motorcycle to add to the cart.
     * @return true if the motorcycle is successfully added to the cart, false otherwise.
     */
    public boolean AddToCart(Motorcycle motorcycle) {
        ShoppingCart.AddOneMoto(motorcycle);
        System.out.println("Motorcycle added to the cart.");
        return true;
    }
}
