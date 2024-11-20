package emi.conception.abstractfactory;

public abstract class Company {
    public void assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
    }

    public void assembleMonitor() {
        Monitor monitor = createMonitor();
        monitor.assemble();
    }



    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();
}
