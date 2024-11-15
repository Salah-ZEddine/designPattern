package emi.conception.observer;

public class TextMessage implements Observer {
    @Override
    public void update(String data) {
        System.out.println("Message updated " +data);
    }
}
