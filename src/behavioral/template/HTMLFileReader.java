package behavioral.template;

import java.io.BufferedReader;
import java.nio.file.Files;

public class HTMLFileReader extends AbstractFileReader {
    public HTMLFileReader(String filePath) {
        super(filePath);
    }

    @Override
    protected void read() {
        System.out.println(">> Reading HTML file: " + filePath.toString());

        // imagine that we are using special logic to parse HTML files
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
