package emi.conception.composite;

public class Client {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
                new CompositeBox(
                        new VideoGame("game1",100)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new VideoGame("game2",200),
                                new Book("book1",100),
                                new Book("book2",200)
                        ),
                        new VideoGame("game3",300)
                )
        );

        System.out.println(deliveryService.calculateDeliveryCost());
    }
}
