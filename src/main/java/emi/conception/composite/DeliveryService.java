package emi.conception.composite;

public class DeliveryService {
    private Box box;

    public void setupOrder(Box ...boxes){
        this.box = new CompositeBox(boxes);
    }

    public double calculateDeliveryCost(){
        return box.calculatePrice();
    }
}
