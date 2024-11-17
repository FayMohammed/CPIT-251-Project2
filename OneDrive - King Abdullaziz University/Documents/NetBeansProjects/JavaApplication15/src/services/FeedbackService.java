
package services;

/**
 *
 * @author Elaf 2105887
 */
import java.util.ArrayList;
import java.util.List;
import models.Feedback; // Import the Feedback class
import utils.NotificationService; // Import the NotificationService class

public class FeedbackService {
    private List<Feedback> feedbackList = new ArrayList<>();

    // Submit feedback
    public void submitFeedback(Feedback feedback) {
        feedbackList.add(feedback); // Add feedback to the list
        System.out.println("Feedback submitted: " + feedback.getMessage());
        
        // Notify supervisor using NotificationService
        NotificationService.notifySupervisor(feedback);
    }

    // List all feedback
    public List<Feedback> getAllFeedback() {
        return feedbackList;
    }
}
