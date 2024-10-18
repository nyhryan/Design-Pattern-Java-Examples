package creational.builder;

import java.util.List;

public class StdoutBuilder {
    private final static DocumentBuilder<StdoutBuilder> builder = new DocumentBuilder<>() {
        private final StringBuilder sb = new StringBuilder();

        @Override
        public DocumentBuilder<StdoutBuilder> withHeader1(String header1Text) {
            sb.append("# ").append(header1Text).append("\n");
            return this;
        }

        @Override
        public DocumentBuilder<StdoutBuilder> withParagraph(String paragraph) {
            sb.append(paragraph).append("\n");
            return this;
        }

        @Override
        public DocumentBuilder<StdoutBuilder> withListItems(List<String> items) {
            items.forEach(item -> sb.append("- ").append(item).append("\n"));
            return this;
        }

        @Override
        public StdoutBuilder build() {
            var stdoutBuilder = new StdoutBuilder();
            stdoutBuilder.content = sb.toString();
            return stdoutBuilder;
        }
    };

    public static DocumentBuilder<StdoutBuilder> builder() {
        return builder;
    }

    private String content;

    /**
     * Print content to stdout
     */
    public void print() {
        System.out.println(content);
    }
}
