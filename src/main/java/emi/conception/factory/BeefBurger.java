package emi.conception.factory;

public class BeefBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("-------------------------BEEF-----------------------");
        System.out.println("Preparing Beef Burger");
        System.out.println("-------------------------/BEEF-----------------------");
    }
}
