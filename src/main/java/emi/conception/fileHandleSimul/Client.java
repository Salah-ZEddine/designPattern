package emi.conception.fileHandleSimul;

public class Client {
    public static void main(String[] args) {
        FileHandlerService fileHandlerService = new FileHandlerService();
        FileFactory wordFac = WordFactory.getInstance();
        FileHandler word = wordFac.createFile();
        fileHandlerService.addFileHandler(word);
        fileHandlerService.processFile("test numero 1");
    }
}
