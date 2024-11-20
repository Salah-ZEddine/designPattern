package emi.conception.fileHandleSimul;

import java.util.ArrayList;
import java.util.List;

public class FileHandlerService {
    private final List<FileHandler> fileHandlers = new ArrayList<>();

    public void processFile(String justBeCreative) {
        for (FileHandler fileHandler : fileHandlers) {
            fileHandler.handle(justBeCreative);
        }
    }

    public void addFileHandler(FileHandler fileHandler) {
        fileHandlers.add(fileHandler);
    }
}
