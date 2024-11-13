package emi.conception.abstractfactory;

public class AsusGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("-----------------Asus-------------------");
        System.out.println("Assembling Asus gpu");
        System.out.println("-----------------Asus-------------------");
    }
}
