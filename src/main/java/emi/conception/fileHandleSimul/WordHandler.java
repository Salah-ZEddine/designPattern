package emi.conception.fileHandleSimul;

public class WordHandler implements FileHandler {
    @Override
    public void handle(String file) {
        System.out.println("processing word file: " + file);
    }
}
