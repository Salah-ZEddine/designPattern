package emi.conception.builder;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int doorsNumber;
    private int screenSize;
    private int weight;
    private int height;


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doorsNumber=" + doorsNumber +
                ", screenSize=" + screenSize +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

}
