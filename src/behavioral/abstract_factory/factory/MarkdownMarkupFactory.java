package behavioral.abstract_factory.factory;

import behavioral.abstract_factory.elements.Heading;
import behavioral.abstract_factory.elements.Paragraph;

public class MarkdownMarkupFactory extends MarkupFactory {
    private static class MarkdownHeading extends Heading {
        public MarkdownHeading(String text) {
            super(text);
        }

        @Override
        public void render() {
            System.out.println("# " + text);
        }
    }

    private static class MarkdownParagraph extends Paragraph {
        public MarkdownParagraph(String text) {
            super(text);
        }

        @Override
        public void render() {
            System.out.println(text);
        }
    }

    @Override
    public Heading createHeading(String text) {
        return new MarkdownMarkupFactory.MarkdownHeading(text);
    }

    @Override
    public Paragraph createParagraph(String text) {
        return new MarkdownMarkupFactory.MarkdownParagraph(text);
    }
}
