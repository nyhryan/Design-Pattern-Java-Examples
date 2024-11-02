package structural.decorator.decorators;

import structural.decorator.Component;

// Concerete Decorator class - adds asterisks to the text
// can decorate other concrete decorators or concrete components
public class AsteriskDecorator extends Decorator {
    public AsteriskDecorator(Component component) {
        super(component);
    }

    @Override
    public void draw() {
        System.out.println("*".repeat(super.getLength()));
        super.draw();
        System.out.println("*".repeat(super.getLength()));
    }
}
