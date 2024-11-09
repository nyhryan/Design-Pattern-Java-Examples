package behavioral.template;

import java.io.BufferedReader;
import java.nio.file.Files;

public class TextFileReader extends AbstractFileReader {
    public TextFileReader(String filePath) {
        super(filePath);
    }

    // Primitive operation
    @Override
    protected void read() {
        System.out.println(">> Reading text file: " + filePath.toString());

        // imagine that we are using special logic to parse text files
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.printf("%02d %s%n", lineNumber++, line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
