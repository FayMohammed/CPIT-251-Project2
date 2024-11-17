
package utils;

/**
 *
 * @author Elaf 2105887
 */

import models.Feedback; // Import the Feedback class

public class NotificationService {
    public static void notifySupervisor(Feedback feedback) {
        System.out.println("Notification: Supervisor notified about feedback - " 
            + feedback.getMessage() + " by " + feedback.getUser());
    }
}

