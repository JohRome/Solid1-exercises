package Uppgift5;

/**
 * The NotificationService class represents a service for announcing a sender using a Sendable object.
 */
public class NotificationService {
    private final Sendable sendable;

    /**
     * Constructs a NotificationService object with the specified Sendable object.
     *
     * @param sendable The Sendable object used for sending notifications.
     */
    public NotificationService(Sendable sendable) {
        this.sendable = sendable;
    }

    /**
     * Announces the sender by invoking the send() method of the Sendable object.
     */
    public void announceSender() {
        sendable.send();
    }
}
