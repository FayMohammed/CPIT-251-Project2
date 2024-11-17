
package models;

/**
 *
 * @author Elaf 2105887
 */

// models/Feedback.java


public class Feedback {
    private String user;    // User providing the feedback
    private String message; // The feedback message

    // Constructor
    public Feedback(String user, String message) {
        this.user = user;
        this.message = message;
    }

    // Getters
    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    // Optional: Override toString for debugging or easy display
    @Override
    public String toString() {
        return "Feedback from " + user + ": " + message;
    }
}
