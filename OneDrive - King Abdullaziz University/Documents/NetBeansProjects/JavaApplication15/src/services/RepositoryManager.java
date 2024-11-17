
package services;

/**
 *
 * @author Elaf 2105887
 */

import java.util.ArrayList;
import java.util.List;
import models.Document; // Import the Document class from the models package

public class RepositoryManager {
    private List<Document> documents = new ArrayList<>();

    // Add document
    public void addDocument(Document doc) {
        documents.add(doc);
        System.out.println("Document added: " + doc.getTitle());
    }

    // Update document
    public void updateDocument(int id, String newContent) {
        for (Document doc : documents) {
            if (doc.getId() == id) {
                doc.setContent(newContent);
                System.out.println("Document updated: " + doc.getTitle());
                return;
            }
        }
        System.out.println("Document not found!");
    }

    // Delete document
    public void deleteDocument(int id) {
        documents.removeIf(doc -> doc.getId() == id);
        System.out.println("Document deleted.");
    }

    // List all documents
    public List<Document> getAllDocuments() {
        return documents;
    }
}


