package structural.decorator.decorators;

import structural.decorator.Component;

// Decorator class implements the Component interface and provides a reference to the Component object.
// delegates methods in the Component interface to the Component object.
// Concrete decorators extend this class and override the methods to add additional functionality.
public abstract class Decorator implements Component {
    private final Component component;
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
    }

    @Override
    public int getLength() {
        return component.getLength();
    }
}
