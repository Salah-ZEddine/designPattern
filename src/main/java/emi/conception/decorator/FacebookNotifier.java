package emi.conception.decorator;

public class FacebookNotifier extends BaseDecorator{

    public FacebookNotifier(INotifier base) {
        super(base);
    }

    @Override
    public void send(String message) {
        System.out.println("send Facebook notification: "+ message);
        super.notifier.send(message);
    }
}
