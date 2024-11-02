package structural.decorator;

// Concrete Component class - can be decorated
public class TextComponent implements Component{
    private final String message;
    public TextComponent(String message) {
        this.message = message;
    }

    @Override
    public void draw() {
        System.out.println(message);
    }

    @Override
    public int getLength() {
        return message.length();
    }
}
