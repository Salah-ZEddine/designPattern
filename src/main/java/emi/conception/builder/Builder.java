package emi.conception.builder;

public interface Builder {
    Builder brand(String brand);
    Builder model(String model);
    Builder color(String color);
    Builder doorNo(int doorNo);
    Builder screen(int size);
    Builder weight(int weight);
    Builder height(int height);
    Car build();
}
