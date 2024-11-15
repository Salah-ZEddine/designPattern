package emi.conception.decorator;

public class Client {
    public static void main(String[] args) {
        INotifier notifier = new FacebookNotifier(new WhatsappNotifier(new EmailNotifier()));
        notifier.send("test");
        notifier = new FacebookNotifier(new EmailNotifier());
        notifier.send("test2");
    }
}
