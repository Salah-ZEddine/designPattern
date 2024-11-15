package emi.conception.observer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String data;
    private List<Observer> observers = new ArrayList<>();
    public Store(String data) {
        this.data = data;
    }

    public void addSubscriber(Observer observer){
        observers.add(observer);
    }
    public void removeSubscriber(Observer observer){
        observers.remove(observer);
    }
    public void update(String data){
        this.data = data;
        notifyObserver();
    }
    public void notifyObserver(){
        for(Observer observer : observers){
            observer.update(this.data);
        }
    }

}
