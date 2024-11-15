package emi.conception.decorator;

public class EmailNotifier implements INotifier{


    @Override
    public void send(String message) {
        System.out.println("send email to client : " + message);
    }
}
