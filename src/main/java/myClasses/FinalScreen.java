package myClasses;

import java.util.Scanner;

/**
 * The FinalScreen class represents the final screen of an application.
 * It allows displaying the total and prompting the user for a review.
 */
public class FinalScreen {

    /**
     * Displays the total.
     */
    public void ShowTotal() {
        // Implementation of displaying total goes here
    }

    /**
     * Prompts the user to provide a review and star rating.
     * Creates a new Reviews object with the provided review and stars.
     */
    public void AskForAReview() {
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
}
