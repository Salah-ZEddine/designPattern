package emi.conception.abstractfactory;

public abstract class Company {
    public Gpu assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    public Monitor assembleMonitor() {
        Monitor monitor = createMonitor();
        monitor.assemble();
        return monitor;
    }



    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();
}
