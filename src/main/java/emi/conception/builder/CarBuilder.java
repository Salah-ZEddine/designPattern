package emi.conception.builder;

public class CarBuilder implements Builder {
    private final Car car;
    public CarBuilder() {
        car = new Car();
    }
    @Override
    public Builder brand(String brand) {
        car.setBrand(brand);
        return this;
    }

    @Override
    public Builder model(String model) {
        car.setModel(model);
        return this;
    }

    @Override
    public Builder color(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public Builder doorNo(int doorNo) {
        car.setDoorsNumber(doorNo);
        return this;
    }

    @Override
    public Builder screen(int size) {
        car.setScreenSize(size);
        return this;
    }

    @Override
    public Builder weight(int weight) {
        car.setWeight(weight);
        return this;
    }

    @Override
    public Builder height(int height) {
        car.setHeight(height);
        return this;
    }

    @Override
    public Car build() {
        return this.car;
    }
}
