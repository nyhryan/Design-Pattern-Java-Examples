package behavioral.template;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.NoSuchElementException;

// Abstract class of File Reader classes
// defines a template method, which is a sequence of steps to read a file
public abstract class AbstractFileReader {
    protected Path filePath;

    public AbstractFileReader(String filePath) {
        this.filePath = Path.of(filePath);
    }

    // !! Template method !!
    public void print() {
        open();
        read(); // <- primitive operation
        close();
    }

    private void open() {
        System.out.println(">> Opening file: " + filePath.toString());
        if (!Files.exists(filePath)) {
            throw new NoSuchElementException("File not found");
        }
    }

    private void close() {
        System.out.println(">> Closing file: " + filePath);
    }

    // Primitive operation: to be implemented by subclasses
    protected abstract void read();
}
