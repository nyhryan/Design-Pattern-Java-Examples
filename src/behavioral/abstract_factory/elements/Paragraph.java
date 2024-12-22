package behavioral.abstract_factory.elements;

public abstract class Paragraph {
    protected final String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public abstract void render();
}
