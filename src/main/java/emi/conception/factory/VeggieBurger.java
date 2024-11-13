package emi.conception.factory;

public class VeggieBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("**********************VEGGIE*********************");
        System.out.println("Preparing Veggie Burger");
        System.out.println("**********************/VEGGIE*********************");
    }
}
