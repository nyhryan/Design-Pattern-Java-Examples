package behavioral.abstract_factory.elements;

public abstract class Heading {
    protected final String text;

    public Heading(String text) {
        this.text = text;
    }

    public abstract void render();
}
