
/**
 *
 * @author Elaf 2105887
 */

import models.Document; // Import the Document class
import models.Feedback; // Import the Feedback class
import services.FeedbackService; // Import the FeedbackService class
import services.RepositoryManager; // Import the RepositoryManager class
import services.SearchService; // Import the SearchService class
import services.TroubleshootingService; // Import the TroubleshootingService class

import java.util.List; // Import List for working with collections

public class Main {
    public static void main(String[] args) {
        // Initialize services
        RepositoryManager repoManager = new RepositoryManager();
        SearchService searchService = new SearchService();
        FeedbackService feedbackService = new FeedbackService();
        TroubleshootingService troubleshootingService = new TroubleshootingService();

        // Create feedback
        Feedback feedback1 = new Feedback("John Doe", "The login guide needs updating.");
        Feedback feedback2 = new Feedback("Jane Smith", "The printer troubleshooting steps are unclear.");

        // Add documents
        repoManager.addDocument(new Document(1, "Login Guide", "How to login to the system."));
        repoManager.addDocument(new Document(2, "Printer Troubleshooting", "Steps to fix printer errors."));

        // Search documents
        List<Document> results = searchService.searchDocuments("login", repoManager.getAllDocuments());
        results.forEach(doc -> System.out.println("Found: " + doc.getTitle()));

        // Submit feedback
        feedbackService.submitFeedback(feedback1);
        feedbackService.submitFeedback(feedback2);

        // Troubleshooting
        troubleshootingService.guideUser("login problem");
    }
}


