package emi.conception.adapter;

public class Client {
    public static void main(String[] args) {
        UniteCentral uniteCentral = new UniteCentral();
        uniteCentral.setVga(new Ecran());
        uniteCentral.print("Bonjour");
        uniteCentral.setVga(new VideoProjector());
        uniteCentral.print("Bonjour");


        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new Tv());
        uniteCentral.setVga(hdmiVgaAdapter);
        uniteCentral.print("Bonjour TV");
    }
}
