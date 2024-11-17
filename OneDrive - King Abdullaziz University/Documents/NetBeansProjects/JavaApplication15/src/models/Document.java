
package models;

/**
 *
 * @author Elaf 2105887
 */
 // Ensure the correct package declaration

public class Document {
    private int id;         // Document ID
    private String title;   // Document Title
    private String content; // Document Content

    // Constructor
    public Document(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    // Setters
    public void setContent(String content) {
        this.content = content;
    }
}
