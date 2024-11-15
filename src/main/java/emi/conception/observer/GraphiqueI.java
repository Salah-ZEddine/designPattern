package emi.conception.observer;

public class GraphiqueI implements Observer {
    @Override
    public void update(String data) {
        System.out.println("Graphical Interface "+data);
    }
}
