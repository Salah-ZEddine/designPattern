package emi.conception.fileHandleSimul;



public class CsvAdapter extends CSV implements FileHandler {
    @Override
    public void handle(String file) {
        System.out.println("************adapter***************");
        super.handleCSV(file);
        System.out.println("************adapter***************");
    }
}
