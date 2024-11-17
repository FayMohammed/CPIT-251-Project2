
package services;

/**
 *
 * @author  Elaf 2105887
 */

import java.util.List;
import java.util.stream.Collectors; // Required for toList()
import models.Document; // Import the Document class from the models package

public class SearchService {
    // Search for documents containing the keyword
    public List<Document> searchDocuments(String keyword, List<Document> documents) {
        return documents.stream()
            .filter(doc -> doc.getContent().contains(keyword)) // Filter by keyword in content
            .collect(Collectors.toList()); // Convert the stream back to a list
    }
}
