package behavioral.abstract_factory;

import behavioral.abstract_factory.factory.MarkupFactory;

// Abstract factory: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
public class Main {
    public static void main(String[] args) {
        var HTMLFactory = MarkupFactory.getFactory(MarkupFactory.Type.HTML);
        var MDFactory = MarkupFactory.getFactory(MarkupFactory.Type.MARKDOWN);

        HTMLFactory.createHeading("Hello, World!").render();
        HTMLFactory.createParagraph("This is a paragraph.").render();

        MDFactory.createHeading("Hello, World!").render();
        MDFactory.createParagraph("This is a paragraph.").render();
    }
}