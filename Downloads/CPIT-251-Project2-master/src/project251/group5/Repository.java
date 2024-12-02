/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251.group5;

/**
 *
 * @author Fay mohammed
 */
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<Guide> guides;

    public Repository() {
    guides = new ArrayList<>();
    System.out.println("Repository initialized!");

    guides.add(new Guide(1, "Troubleshooting Printer Issues", "Hardware", "Pending"));
    guides.add(new Guide(2, "How to Reset Password", "Account Management", "Approved"));
    guides.add(new Guide(3, "Network Connection Issues", "Network", "Under Review"));

    // Debugging: Print the list of guides
    System.out.println("Guides loaded: " + guides.size());
}


    public List<Guide> getAllGuides() {
        return guides;
    }

    public Guide getGuideByID(int guideID) {
        return guides.stream()
                .filter(guide -> guide.getGuideID() == guideID)
                .findFirst()
                .orElse(null);
    }
    
}
