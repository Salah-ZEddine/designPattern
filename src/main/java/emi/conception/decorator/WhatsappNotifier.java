package emi.conception.decorator;

public class WhatsappNotifier extends BaseDecorator {

    public WhatsappNotifier(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("send whatsapp message: " + message);
        super.notifier.send(message);
    }
}
