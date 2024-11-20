package emi.conception.factory;

public abstract class Restaurant {

    public void orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
    }
    public abstract Burger createBurger();
}
