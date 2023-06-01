package Uppgift5;

/**
 * The PhoneSender class represents a phone sender that implements the Sendable interface.
 */
public class PhoneSender implements Sendable {

    /**
     * Sends an SMS.
     */
    @Override
    public void send() {
        System.out.println("Sending an SMS");
    }
}
