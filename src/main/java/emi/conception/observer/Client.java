package emi.conception.observer;

public class Client {
    public static void main(String[] args) {
        Store store = new Store("New Store");
        Observer gui = new GraphiqueI();
        Observer text = new TextMessage();
        store.addSubscriber(gui);
        store.addSubscriber(text);
        store.notifyObserver();
        store.update("nouveau marché");
    }
}
