package emi.conception.adapter;

public class VideoProjector implements Vga{
    @Override
    public void print(String message) {
        System.out.println("-----------VP--------------");
        System.out.println(message);
        System.out.println("-----------VP--------------");
    }
}
