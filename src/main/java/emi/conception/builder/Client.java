package emi.conception.builder;

public class Client {
    public static void main(String[] args) {
        Builder carBuilder = new CarBuilder();
        Director director = new Director();
        director.buildBugatti(carBuilder);
        Car car = carBuilder.build();
        System.out.println(car);
    }
}
