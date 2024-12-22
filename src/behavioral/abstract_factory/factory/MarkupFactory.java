package behavioral.abstract_factory.factory;

import behavioral.abstract_factory.elements.Heading;
import behavioral.abstract_factory.elements.Paragraph;

import java.util.Map;

public abstract class MarkupFactory {
    public enum Type {
        HTML, MARKDOWN
    }

    private static class Holder {
        private final static Map<MarkupFactory.Type, MarkupFactory> factories = Map.of(
                MarkupFactory.Type.HTML, new HTMLMarkupFactory(),
                MarkupFactory.Type.MARKDOWN, new MarkdownMarkupFactory()
        );
    }

    public static MarkupFactory getFactory(MarkupFactory.Type type) {
        return MarkupFactory.Holder.factories.get(type);
    }

    // These are "Factory Methods"
    // an interface of creating objects without knowing the concrete class
    public abstract Heading createHeading(String text);
    public abstract Paragraph createParagraph(String text);
}
