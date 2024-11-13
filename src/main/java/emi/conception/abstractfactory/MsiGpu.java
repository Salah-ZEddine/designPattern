package emi.conception.abstractfactory;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("*****************MSI*******************");
        System.out.println("assembling MSI Gpu");
        System.out.println("*****************MSI*******************");
    }
}
