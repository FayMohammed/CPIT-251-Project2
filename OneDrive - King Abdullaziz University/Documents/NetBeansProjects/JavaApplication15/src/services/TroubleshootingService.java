
package services;

/**
 *
 * @author Elaf 2105887
 */
// TroubleshootingService.java
public class TroubleshootingService {
    public void guideUser(String issue) {
        switch (issue.toLowerCase()) {
            case "login problem":
                System.out.println("Step 1: Check your internet connection.\nStep 2: Ensure credentials are correct.");
                break;
            case "printer error":
                System.out.println("Step 1: Restart the printer.\nStep 2: Check if it's connected properly.");
                break;
            default:
                System.out.println("Issue not recognized. Please contact support.");
        }
    }
}

