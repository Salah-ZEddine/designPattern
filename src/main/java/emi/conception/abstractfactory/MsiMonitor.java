package emi.conception.abstractfactory;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("*****************MSI*******************");
        System.out.println("MsiMonitor assemble");
        System.out.println("*****************MSI*******************");
    }
}
