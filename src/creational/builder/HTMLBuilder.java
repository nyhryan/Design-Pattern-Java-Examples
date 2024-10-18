package creational.builder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HTMLBuilder {
    private final static DocumentBuilder<HTMLBuilder> builder = new DocumentBuilder<>() {
        private final StringBuilder sb = new StringBuilder();

        private final String HEAD = """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                  <title>Index</title>
                </head>
                <body>
                """;
        private final String TAIL = """
                </body>
                </html>
                """;

        @Override
        public DocumentBuilder<HTMLBuilder> withHeader1(String header1Text) {
            sb.append("<h1>").append(header1Text).append("</h1>\n");
            return this;
        }

        @Override
        public DocumentBuilder<HTMLBuilder> withParagraph(String paragraph) {
            sb.append("<p>").append(paragraph).append("</p>\n");
            return this;
        }

        @Override
        public DocumentBuilder<HTMLBuilder> withListItems(List<String> items) {
            sb.append("<ul>\n");
            items.forEach(item -> sb.append("  <li>").append(item).append("</li>\n"));
            sb.append("</ul>\n");
            return this;
        }

        @Override
        public HTMLBuilder build() {
            var htmlBuilder = new HTMLBuilder();

            sb.insert(0, HEAD).append(TAIL);
            htmlBuilder.content = sb.toString();

            return htmlBuilder;
        }
    };

    public static DocumentBuilder<HTMLBuilder> builder() {
        return builder;
    }

    private String content;

    /**
     * Print the content
     * @param fileName File name
     */
    public void save(String fileName) {
        final File file = new File(fileName);
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.printf("File saved to %s%n", file.getAbsolutePath());
        }
    }
}
