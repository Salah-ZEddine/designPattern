package emi.conception.abstractfactory;

public class AsusMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("-----------------Asus-------------------");
        System.out.println("Assembling Asus Monitor");
        System.out.println("-----------------Asus-------------------");
    }
}
