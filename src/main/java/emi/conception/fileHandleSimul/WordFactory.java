package emi.conception.fileHandleSimul;

public class WordFactory extends FileFactory {
    private static WordFactory instance;
    private WordFactory() {}

    public static WordFactory getInstance() {
        if (instance == null) {
            instance = new WordFactory();
        }
        return instance;
    }

    @Override
    public FileHandler createFile() {
        return new WordHandler();
    }
}
