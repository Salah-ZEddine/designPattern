package emi.conception.abstractfactory;

public class Client {
    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        msi.assembleGpu();
        msi.assembleMonitor();

        Company asus = new AsusManufacturer();
        asus.assembleGpu();
        asus.assembleMonitor();

    }
}
