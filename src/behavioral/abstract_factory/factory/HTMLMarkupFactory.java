package behavioral.abstract_factory.factory;

import behavioral.abstract_factory.elements.Heading;
import behavioral.abstract_factory.elements.Paragraph;

public class HTMLMarkupFactory extends MarkupFactory {
    private static class HTMLHeading extends Heading {
        public HTMLHeading(String text) {
            super(text);
        }

        @Override
        public void render() {
            System.out.println("<h1>" + text + "</h1>");
        }
    }

    private static class HTMLParagraph extends Paragraph {
        public HTMLParagraph(String text) {
            super(text);
        }

        @Override
        public void render() {
            System.out.println("<p>" + text + "</p>");
        }
    }

    @Override
    public Heading createHeading(String text) {
        return new HTMLMarkupFactory.HTMLHeading(text);
    }

    @Override
    public Paragraph createParagraph(String text) {
        return new HTMLMarkupFactory.HTMLParagraph(text);
    }
}
