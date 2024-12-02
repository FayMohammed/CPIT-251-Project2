
package project251.group5;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author loofe
 */

public class FeedbackService {
    public void submitFeedback(int guideID, String feedbackContent) {
        try (FileWriter writer = new FileWriter("feedback.txt", true)) {
            writer.write("Guide ID: " + guideID + " - Feedback: " + feedbackContent + "\n");
            System.out.println("Feedback submitted successfully!");
        } catch (IOException e) {
            System.out.println("Error submitting feedback.");
            e.printStackTrace();
        }
    }
}
