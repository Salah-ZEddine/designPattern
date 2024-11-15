package emi.conception.decorator;

public abstract class BaseDecorator implements INotifier{
    INotifier notifier;
    public BaseDecorator(INotifier notifier) {
        this.notifier = notifier;
    }
    public abstract void send(String message);
}
