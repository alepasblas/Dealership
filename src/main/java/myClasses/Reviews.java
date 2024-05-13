package myClasses;

/**
 * The Reviews class represents a review with a corresponding star rating.
 * It provides methods to retrieve and modify the review text and star rating.
 */
public class Reviews {
    String review; // The text of the review
    int stars; // The star rating associated with the review

    /**
     * Constructs a new Reviews object with the specified review text and star rating.
     *
     * @param review The text of the review.
     * @param stars  The star rating associated with the review.
     */
    public Reviews(String review, int stars) {
        this.review = review;
        this.stars = stars;
    }

    /**
     * Retrieves the text of the review.
     *
     * @return The text of the review.
     */
    public String getReview() {
        return review;
    }

    /**
     * Sets the text of the review.
     *
     * @param review The text to set.
     */
    public void setReview(String review) {
        this.review = review;
    }

    /**
     * Retrieves the star rating associated with the review.
     *
     * @return The star rating.
     */
    public int getStars() {
        return stars;
    }

    /**
     * Sets the star rating associated with the review.
     *
     * @param stars The star rating to set.
     */
    public void setStars(int stars) {
        this.stars = stars;
    }
}
