package emi.conception.factory;

public class Client {
    public static void main(String[] args) {
        Restaurant beefResto = new BeefBurgerRestaurant();
        beefResto.orderBurger();

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();
    }
}
