package Uppgift5;

public class Main {
    public static void main(String[] args) {
        var email = new EmailSender();
        var phone = new PhoneSender();

        var service = new NotificationService(phone);
        service.announceSender();





    }
}
