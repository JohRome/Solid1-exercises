package Uppgift5;

/**
 * The EmailSender class represents an email sender that implements the Sendable interface.
 */
public class EmailSender implements Sendable {

    /**
     * Sends an email.
     */
    @Override
    public void send() {
        System.out.println("Sending an email");
    }
}
